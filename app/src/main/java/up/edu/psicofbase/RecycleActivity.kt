package up.edu.psicofbase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*
import java.sql.DatabaseMetaData

class RecycleActivity : AppCompatActivity() {

    private lateinit var dbref : DatabaseReference
    private lateinit var userRecyclerView : RecyclerView
    private lateinit var userArrayList : ArrayList<PsychList>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle)

        userRecyclerView = findViewById(R.id.recviewlist)
        userRecyclerView.layoutManager = LinearLayoutManager(this)
        userRecyclerView.setHasFixedSize(true)

        userArrayList = arrayListOf<PsychList>()

        getUserData()
    }

    private fun getUserData(){
        dbref = FirebaseDatabase.getInstance().getReference("/listapisco/adcgaW9EP3eTxwqyop0M")
        dbref.addValueEventListener(object: ValueEventListener{

            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()){
                    for (userSnapshot in snapshot.children){
                        val psycho = userSnapshot.getValue(PsychList::class.java)
                        userArrayList.add(psycho!!)
                    }
                    userRecyclerView.adapter = NewAdapter(userArrayList)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })
    }
}