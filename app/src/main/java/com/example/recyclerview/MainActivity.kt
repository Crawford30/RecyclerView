package com.example.recyclerview
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity(), onOnlyBelieveItemClickListener {

    lateinit var binding: ActivityMainBinding

    lateinit var onlybelievelist: ArrayList<OnlyBelieve>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        onlybelievelist = ArrayList()
        //=====adding element to the ArrayList
        addOnlyBelieve()

        //onybelieverecycler.
        onybelieverecycler.layoutManager = LinearLayoutManager(this)
        onybelieverecycler.addItemDecoration(DividerItemDecoration(this, 1))
        //===1 put line horizonatally, 2 vertically

        //onybelieverecycler.adapter = OnlyBelieveAdapter(onlybelievelist)
        // OnlyBelieveAdapter accepts only one parameter of  onlybelievelist

        //=========accespt two parameter now

        onybelieverecycler.adapter = OnlyBelieveAdapter(onlybelievelist,this)





    }



    //====adding objects to the Onlybelieve song list==

    fun addOnlyBelieve() {
        onlybelievelist.add(OnlyBelieve("1 ONLY BELIEVE (C)","Fear not, little flock, from the cross to the throne,\n" +
                "From death into life He went for His own; \n" +
                "All power in earth, all power above,\n" +
                "Is given to Him for the flock of His love. \n" +
                "\n" +
                "CHORUS\n" +
                "Only believe, only believe,\n" +
                "All things are possible, only believe;\n" +
                "Only believe, only believe,\n" +
                "All things are possible, only believe.\n" +
                "(Lord, I believe . . .)\n" +
                "(Lord, I receive . . .)\n" +
                "(Jesus is here...)\n" +
                "\t\n" +
                "Fear not, little flock, He goeth ahead,\n" +
                "Your Shepherd selecteth the path you must tread;\n" +
                "The waters of Marah He’ll sweeten for thee,\n" +
                "He drank all the bitter in Gethsemane. \n" +
                "\n" +
                "Fear not, little flock, whatever your lot,\n" +
                "He enters all rooms, “the doors being shut;”\n" +
                "He never forsakes, He never is gone, \n" +
                "So, count on His presence in darkness and dawn. \n",R.drawable.logo));


        onlybelievelist.add(OnlyBelieve("2 AMAZING GRACE (Ab) \n", "Amazing grace! How sweet the sound,\n" +
                "That saved a wretch like me!\n" +
                "I once was lost, but now am found,\n" +
                "Was blind, but now I see. \n" +
                "\n" +
                "Twas grace that taught my heart to fear,\n" +
                "And grace my fears relieved;\n" +
                "How precious did that grace appear\n" +
                "The hour I first believe! \n" +
                "\n" +
                "\n" +
                "Through many dangers, toils and snares,\n" +
                "I have already come;\n" +
                "‘Tis grace hath brought me safe thus far,\n" +
                "And grace will lead me home. \n" +
                "\n" +
                "When we’ve been there ten thousand years,\n" +
                "Bright shining as the sun;\n" +
                "We’ve no less days to sing God’s praise\n" +
                "Than when we first begun. \n", R.drawable.logo));






        onlybelievelist.add(OnlyBelieve("3 THEY COME (Eb) \n", "They come from the East and West,\n" +
                "They come from the lands afar,\n" +
                "To feast with the King, to done as His guest;\n" +
                "How blessed these pilgrims are!\n" +
                "Beholding His hallowed face,\n" +
                "Aglow with light divine;\n" +
                "Blest partakers of His grace,\n" +
                "As gems in His crown to shine. \n" +
                "\n" +
                "CHORUS\n" +
                "Since Jesus has set me free, \n" +
                "I’m happy as heart can be;\n" +
                "No longer I bear the burden of care,\n" +
                "His yoke is so sweet to me.\n" +
                "My soul was as black as night.\n" +
                "But darkness has taken flight;\n" +
                "Now I shout the victory,\u2028\n" +
                "For Jesus has set me free. \n" +
                "I look on the great white throne,\n" +
                "Before it the ransom’d stand;\n" +
                "No longer are tears, no sorrow is known\n" +
                "Nor death in that goodly land. \n" +
                "My Saviour has gone before,\n" +
                "Preparing the way for me;\n" +
                "Soon we’ll meet to part no more \n" +
                "Thru time or eternity. \n" +
                "\n" +
                "The gates of that holy place\n" +
                "Stand open by night and day;\n" +
                "O look to the Lord who “giveth more grace,”\n" +
                "Whose love has prepared the way.\n" +
                "A home in those mansions fair\n" +
                "His hand hath reserve for all.\n" +
                "For the wedding feast prepare,\n" +
                "Obeying the gracious call. \n",R.drawable.logo));

        onlybelievelist.add(OnlyBelieve("4 I LOVE HIM (C)\n", "Gone from my heart the world and all its charms;\n" +
                "Now, through the blood, I’m saved from all alarms;\n" +
                "Down at the cross my heart is bending low;\n" +
                "The precious blood of Jesus cleanses white as snow. \n" +
                "\n" +
                "CHORUS\n" +
                "I love Him, I love Him \n" +
                "Because He first loved me\n" +
                "And purchased my salvation\n" +
                "On Calvary’s tree. \n" +
                "\n" +
                "Once I was lost, and ‘way down deep in sin;\n" +
                "Once was a slave to passions fierce within,\n" +
                "Once was afraid to trust a loving God; \n" +
                "But now I’m cleansed from every stain through Jesus’ blood. \n" +
                "\n" +
                "Once I was bound, but now I am set free;\n" +
                "Once I was blind, but now the light I see;\n" +
                "Once I was dead, but now in Christ I live,\n" +
                "To tell the world around the peace that he doth give. \n", R.drawable.logo));

        // onlybelievelist.add(OnlyBelieve());
         onlybelievelist.add(OnlyBelieve("5 SWEET HOUR OF PRAYER (Eb) \n", "\n" +
                 "Sweet hour of prayer, sweet hour of prayer,\n" +
                 "That calls me from a world of care,\n" +
                 "And bids me, at my Father’s throne,\n" +
                 "Make all my wants and wishes known;\n" +
                 "In seasons of distress and grief,\n" +
                 "My soul has often found relief,\n" +
                 "And oft escaped the tempter’s snare,\n" +
                 "By thy return, sweet hour of prayer. \n" +
                 "\n" +
                 "Sweet hour of prayer, sweet hour of prayer,\n" +
                 "The joy I feel, the bliss I share,\n" +
                 "Of those whose anxious spirits burn\n" +
                 "With strong desires for thy return!\n" +
                 "With such I hasten to the place\n" +
                 "Where God, my Saviour, shows His face,\n" +
                 "And gladly take my station there,\n" +
                 "And wait for thee, sweet hour of prayer. \n" +
                 "\n" +
                 "Sweet hour of prayer, sweet hour of prayer,\n" +
                 "Thy wings shall my petition bear\n" +
                 "To Him whose truth and faithfulness\n" +
                 "Engage the waiting soul to bless;\n" +
                 "And since He bids me seek His face,\n" +
                 "Believe His Word and trust His grace,\n" +
                 "I’ll cast on Him my every care,\n" +
                 "And wait for thee, sweet hour of prayer. \n",  R.drawable.logo));





        onlybelievelist.add(OnlyBelieve("6 OH, HOW I LOVE JESUS (Ab) \n", "There is a name I love to hear, \n" +
                "I love to sing its worth;\n" +
                "It sounds like music in mine ear,\n" +
                "The sweetest name on earth. \n" +
                "\n" +
                "CHORUS\n" +
                "Oh, how I love Jesus, \n" +
                "Oh, how I love Jesus, \n" +
                "Oh, how I love Jesus, \n" +
                "Because He first love me.\n" +
                "(I’ll never forsake Him . . .)\n" +
                "\n" +
                "It tells me of a Saviour’s love,\n" +
                "Who died to set me free;\n" +
                "It tells me of His precious blood;\n" +
                "The sinner’s perfect plea. \n" +
                "\n" +
                "It tells me what my Father hath in store for every day,\n" +
                "And though I tread a darksome path,\n" +
                "yields sunshine all the way. \n" +
                "\n" +
                "It tells of One whose loving heart\n" +
                "Can feel my deepest woe,\n" +
                "Who in each sorrow bears a part,\n" +
                "That none can bear below. \n",  R.drawable.logo ));

    }

    //====implement the class

    override fun onItemclick(item: OnlyBelieve, position: Int) {
        ///TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

            Toast.makeText(this, item.lyrics, Toast.LENGTH_SHORT).show()

        //=================Adding activity that directs a user to on click

        val intent = Intent(this, OnlyBelieveDetailsActivity::class.java)
        intent.putExtra("TITLE", item.title)
        intent.putExtra("LYRIC", item.lyrics)
        intent.putExtra("LOGO", item.logo.toString())
        startActivity(intent)



    }
}
