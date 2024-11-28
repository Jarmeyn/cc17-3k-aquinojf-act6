package com.example.my30daysdatingchallenge

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.my30daysdatingchallenge.adapter.RecyclerAdapter
import com.example.my30daysdatingchallenge.model.RecyclerModel


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private val recyclerModel: MutableList<RecyclerModel> = ArrayList()
    private lateinit var recyclerAdapter: RecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv_name)

        initializeRecyclerModel()

        recyclerAdapter = RecyclerAdapter(this, recyclerModel)
        recyclerView.apply {
            adapter = recyclerAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }

    private fun initializeRecyclerModel() {
        recyclerModel.apply {
            add(RecyclerModel("Day 1", "Share Your Favorite Memories", R.drawable.d1, "Sit together and share the happiest memories from your life. No props needed—just your stories."))
            add(RecyclerModel("Day 2", "Go for a Walk in Nature", R.drawable.d2, "Visit a nearby park or trail and enjoy some fresh air and conversation."))
            add(RecyclerModel("Day 3", "Watch a Free Movie at Home", R.drawable.d3, "Pick a movie neither of you has seen (or an old favorite) and make it a cozy movie night."))
            add(RecyclerModel("Day 4", "Cook Together Using Pantry Staples", R.drawable.d4, "Get creative with what you already have in the kitchen and make a meal together."))
            add(RecyclerModel("Day 5", "Have a Board Game or Card Game Night", R.drawable.d5, "Use what you have or download free games on your phone to play together."))
            add(RecyclerModel("Day 6", "Write a List of Things You’re Grateful For", R.drawable.d6, "Reflect on what you’re thankful for in life and your relationship."))
            add(RecyclerModel("Day 7", "DIY Photo Album", R.drawable.d7, "Use old photos or phone pictures to create a digital or handmade album together."))
            add(RecyclerModel("Day 8", "Watch a Sunset Together", R.drawable.d8, "Find a nearby spot to enjoy nature’s beauty—it’s free and romantic!"))
            add(RecyclerModel("Day 9", "Have a 'Would You Rather' Challenge", R.drawable.d9, "Ask each other funny or deep 'Would You Rather' questions."))
            add(RecyclerModel("Day 10", "Try Crochet", R.drawable.d10, "It’s always fun to try something new together!"))
            add(RecyclerModel("Day 11", "Karaoke Session", R.drawable.d11, "Turn your living room into a concert hall and sing your hearts out."))
            add(RecyclerModel("Day 12", "Share Childhood Stories", R.drawable.d12, "Swap funny or meaningful stories from when you were younger."))
            add(RecyclerModel("Day 13", "Have a Compliment Contest", R.drawable.d13, "Take turns giving compliments until someone can’t think of one anymore."))
            add(RecyclerModel("Day 14", "Create a Dream Vision Board", R.drawable.d14, "Use old magazines or draw pictures of your dreams for the future together."))
            add(RecyclerModel("Day 15", "DIY Camping Night", R.drawable.d15, "Set up a cozy indoor campsite with blankets and pillows."))
            add(RecyclerModel("Day 16", "Visit a Free Local Attraction", R.drawable.d16, "Find a free museum, park, or event nearby and explore it together."))
            add(RecyclerModel("Day 17", "Have a No-Talking Challenge", R.drawable.d17, "Communicate only with gestures and notes for an hour—it’s hilarious!"))
            add(RecyclerModel("Day 18", "Write a Bucket List Together", R.drawable.d18, "Dream big and list all the adventures you want to share in life."))
            add(RecyclerModel("Day 19", "Swap Books or Watch Short Documentaries", R.drawable.d19, "Share your favorite reads or discover something new online."))
            add(RecyclerModel("Day 20", "Do a Free Online Quiz", R.drawable.d20, "Take personality or relationship quizzes together online."))
            add(RecyclerModel("Day 21", "Play 'Two Truths and a Lie'", R.drawable.d21, "Challenge each other to see how well you know one another."))
            add(RecyclerModel("Day 22", "Volunteer Together", R.drawable.d22, "Look for ways to give back, like cleaning a park or helping a local shelter."))
            add(RecyclerModel("Day 23", "Have a DIY Photoshoot", R.drawable.d23, "Use your phone to snap fun photos around your home or neighborhood."))
            add(RecyclerModel("Day 24", "Swap Phone Playlists", R.drawable.d24, "Listen to each other’s favorite songs and talk about what they mean to you."))
            add(RecyclerModel("Day 25", "Watch the Stars", R.drawable.d5, "Sit outside under the night sky with a blanket and enjoy the stars."))
            add(RecyclerModel("Day 26", "Take a Neighborhood Stroll", R.drawable.d26, "Walk around your area and notice things you’ve never paid attention to before."))
            add(RecyclerModel("Day 27", "Try Meditation or Yoga Together", R.drawable.d27, "Follow a free YouTube video and enjoy some calming moments."))
            add(RecyclerModel("Day 28", "Create a Couple’s Scrapbook", R.drawable.d28, "Use items you already have to craft a meaningful scrapbook."))
            add(RecyclerModel("Day 29", "Share Dreams for the Future", R.drawable.d29, "Discuss your hopes and dreams for your life and relationship."))
            add(RecyclerModel("Day 30", "Celebrate with a Home Date Night", R.drawable.d30, "Cook something simple, light candles, and toast to completing the challenge!"))
        }
    }

}
