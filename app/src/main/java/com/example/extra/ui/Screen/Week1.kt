package com.example.extra.ui.Screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.extra.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun WeekOne(
    modifier: Modifier = Modifier.background(Color(7, 15, 25)),
    navigateToNext: (ScreenName: String) -> Unit,
) {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            MediumTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(27, 26, 85),
                    titleContentColor = Color.White,
                ),
                title = {
                    Text(
                        "Week 1",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navigateToNext("phase1") }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Localized description"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description"
                        )
                    }
                },
                scrollBehavior = scrollBehavior
            )
        },
    ) {
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Row {
                Card(
                    modifier = Modifier
                        .padding(15.dp, 130.dp, 0.dp, 0.dp)
                        .background(Color(7, 15, 25)),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(146, 144, 195)
                    )
                ) {
                    Text(
                        text = "MONDAY",
                        modifier = Modifier
                            .padding(25.dp, 10.dp, 25.dp, 10.dp),
                        color = Color(7, 15, 43),
                        style = TextStyle(
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Row {
                        Text(
                            text = "Upper body",
                            modifier = Modifier
                                .padding(10.dp, 10.dp, 10.dp, 10.dp),
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .padding(10.dp, 130.dp, 0.dp, 0.dp)
                        .background(Color(7, 15, 25)),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(146, 144, 195)
                    )
                ) {
                    Text(
                        text = "TUESDAY",
                        modifier = Modifier
                            .padding(25.dp, 10.dp, 25.dp, 10.dp),
                        color = Color(7, 15, 43),
                        style = TextStyle(
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Row {
                        Text(
                            text = "Rest",
                            modifier = Modifier
                                .padding(10.dp, 10.dp, 10.dp, 10.dp),
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .padding(10.dp, 130.dp, 0.dp, 0.dp)
                        .background(Color(7, 15, 25)),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(146, 144, 195)
                    )
                ) {
                    Text(
                        text = "WEDNESDAY",
                        modifier = Modifier
                            .padding(10.dp, 10.dp, 10.dp, 10.dp),
                        color = Color(7, 15, 43),
                        style = TextStyle(
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Row {
                        Text(
                            text = "Cardio",
                            modifier = Modifier
                                .padding(10.dp, 10.dp, 10.dp, 10.dp),
                        )
                    }
                }
            }
            Row {
                Card(
                    modifier = Modifier
                        .padding(15.dp, 20.dp, 0.dp, 0.dp)
                        .background(Color(7, 15, 25)),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(146, 144, 195)
                    )
                ) {
                    Text(
                        text = "THURSDAY",
                        modifier = Modifier
                            .padding(20.dp, 10.dp, 15.dp, 10.dp),
                        color = Color(7, 15, 43),
                        style = TextStyle(
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Row {
                        Text(
                            text = "Lower Body",
                            modifier = Modifier
                                .padding(10.dp, 10.dp, 10.dp, 10.dp),
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .padding(10.dp, 20.dp, 0.dp, 0.dp)
                        .background(Color(7, 15, 25)),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(146, 144, 195)
                    )
                ) {
                    Text(
                        text = "FRIDAY",
                        modifier = Modifier
                            .padding(34.dp, 10.dp, 34.dp, 10.dp),
                        color = Color(7, 15, 43),
                        style = TextStyle(
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Row {
                        Text(
                            text = "Arts & Cardio",
                            modifier = Modifier
                                .padding(10.dp, 10.dp, 10.dp, 10.dp),
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .padding(10.dp, 20.dp, 0.dp, 0.dp)
                        .background(Color(7, 15, 25)),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(146, 144, 195)
                    )
                ) {
                    Text(
                        text = "SATURDAY",
                        modifier = Modifier
                            .padding(19.dp, 10.dp, 19.dp, 10.dp),
                        color = Color(7, 15, 43),
                        style = TextStyle(
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Row {
                        Text(
                            text = "Upper body",
                            modifier = Modifier
                                .padding(10.dp, 10.dp, 10.dp, 10.dp),
                        )
                    }
                }
            }
            Row {
                Card(
                    modifier = Modifier
                        .padding(15.dp, 20.dp, 0.dp, 0.dp)
                        .background(Color(7, 15, 25)),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(146, 144, 195)
                    )
                ) {
                    Text(
                        text = "SUNDAY",
                        modifier = Modifier
                            .padding(27.dp, 10.dp, 27.dp, 10.dp),
                        color = Color(7, 15, 43),
                        style = TextStyle(
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Row {
                        Text(
                            text = "Cheat day",
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(10.dp, 10.dp, 10.dp, 10.dp),
                        )
                    }
                }
            }
            Text(
                text = "Upper Body Exercise",
                modifier = Modifier.padding(10.dp, 15.dp, 0.dp, 0.dp),
                color = Color(146, 144, 195),
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 0.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                )
            )
            {
                Box {
                    val image = painterResource(id = R.drawable.upperbody1)
                    Image(
                        painter = image,
                        contentDescription = null, alignment = Alignment.BottomEnd,
                        modifier = Modifier.alpha(0.8f),
                    )
                }
                Text(
                    text = "3 Round of 10: Seated Dumbbell Overhead Press",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Sit on the side of a bench with a dumbbell in each hand, palms facing" +
                            "out, and feet close together. Bend at the elbows executing a bicep" +
                            "curl, then rotate palms out at shoulder height and finish by pushing" +
                            "your arms up above your head until the dumbbells almost touch." +
                            "Your arms should not completely straighten. Reverse the motion and" +
                            "return to the starting position.",
                    modifier = Modifier.padding(10.dp, 0.dp),
                )
            }
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 0.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                )
            )
            {
                Box {
                    val image = painterResource(id = R.drawable.upperbody2)
                    Image(
                        painter = image,
                        contentDescription = null, alignment = Alignment.BottomEnd,
                        modifier = Modifier.alpha(0.8f),
                    )
                }
                Text(
                    text = "3 rounds of 10: Lat Pulldowns",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Sitting at a pulldown machine, reach up and grab the bar by the " +
                            "handles. Keep your back straight and pull down the bar close to your " +
                            "chest, squeezing your shoulder blades together. Hold for a moment " +
                            "and release your arms slowly up to the starting position.",
                    modifier = Modifier.padding(10.dp, 0.dp),
                )
            }
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 0.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                )
            )
            {
                Box {
                    val image = painterResource(id = R.drawable.upperbody3)
                    Image(
                        painter = image,
                        contentDescription = null, alignment = Alignment.BottomEnd,
                        modifier = Modifier.alpha(0.8f),
                    )
                }
                Text(
                    text = "3 Round of 10: Chest Fly (machine)",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Adjust the arms of the chest fly machine so they are on either side " +
                            "of your body. Facing away from the weight stack, sit down and grab " +
                            "the handles. With a bent elbow, bring your fists close to one another," +
                            "squeezing your chest as you go. Keep your elbows elevated to fist " +
                            "height. Don’t let them drop down, and reverse the motion, slowly " +
                            "returning to the start position.",
                    modifier = Modifier.padding(10.dp, 0.dp),
                )
            }
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 0.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                )
            )
            {
                Box {
                    val image = painterResource(id = R.drawable.upperbody4)
                    Image(
                        painter = image,
                        contentDescription = null, alignment = Alignment.BottomEnd,
                        modifier = Modifier.alpha(0.8f),
                    )
                }
                Text(
                    text = "3 Round of 10: Rear Delt Fly(machine)",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "On a chest fly machine, position arms all the way back behind the " +
                            "seat, and sit facing the weight stack. Grab the handles and push " +
                            "back, arms slightly bent, until hands are straight out on either side of " +
                            "the body. Slowly return to starting position.",
                    modifier = Modifier.padding(10.dp, 0.dp),
                )
            }
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 0.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                )
            )
            {
                Box {
                    val image = painterResource(id = R.drawable.upperbody5)
                    Image(
                        painter = image,
                        contentDescription = null, alignment = Alignment.BottomEnd,
                        modifier = Modifier.alpha(0.8f),
                    )
                }
                Text(
                    text = "3 Round of 8: Tricep Dips",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Find a bench and stand facing away from it. Squat down, lowering " +
                            "your body until it is close enough to the bench that you can place your " +
                            "palms face down on the edge of the bench, fingers pointed toward you " +
                            "and curled around the side. Push your feet out to increase the weight " +
                            "on your arms and decrease the weight on your feet until you feel you " +
                            "have reached a weight that your arms can comfortably support, but " +
                            "that doesn’t stress your shoulders. Slowly bend your elbows, lowering " +
                            "your trunk until your upper arms are parallel with the ground and " +
                            "elbow is at a 90 degree angle. You may have a greater than 90 degree " +
                            "angle if your body is close to the bench. The important thing here is " +
                            "not to stress your shoulders too much. Reverse the motion and push " +
                            "your arms back to a near straight position. Be careful not to lock your " +
                            "elbows out completely.",
                    modifier = Modifier.padding(10.dp, 0.dp),
                )
            }
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 0.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                )
            )
            {
                Box {
                    val image = painterResource(id = R.drawable.upperbody6)
                    Image(
                        painter = image,
                        contentDescription = null, alignment = Alignment.BottomEnd,
                        modifier = Modifier.alpha(0.8f),
                    )
                }
                Text(
                    text = "3 Round of 10: Seated Upright Row (machine)",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Find a weighted rowing machine and sit facing the handles or cable. " +
                            "Place the pin to hold enough weight so that you will just barely be " +
                            "able to complete 10 repetitions. Sit with a strong neutral spine and " +
                            "pull your arms back, elbows tight to your body, squeezing your " +
                            "shoulder blades together. Pause for a moment and very slowly return" +
                            "your arms to a straight position",
                    modifier = Modifier.padding(10.dp, 0.dp),
                )
            }
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 0.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                )
            )
            {
                Box {
                    val image = painterResource(id = R.drawable.upperbody7)
                    Image(
                        painter = image,
                        contentDescription = null, alignment = Alignment.BottomEnd,
                        modifier = Modifier.alpha(0.8f),
                    )
                }
                Text(
                    text = "3 Round of 10: Seated Bicep Curls",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Find two suitably weighted dumbbells and sit on a bench with feet " +
                            "together. Starting with straight arms, bend elbows until fists are near " +
                            "shoulders, palms facing in. Reverse the motion to starting position.",
                    modifier = Modifier.padding(10.dp, 0.dp),
                )
            }
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 0.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                )
            )
            {
                Box {
                    val image = painterResource(id = R.drawable.upperbody8)
                    Image(
                        painter = image,
                        contentDescription = null, alignment = Alignment.BottomEnd,
                        modifier = Modifier.alpha(0.8f),
                    )
                }
                Text(
                    text = "3 Round of 12: Kneeling Tricep Kickback",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Holding a dumbbell, find a bench and kneel with one foot still on the " +
                            "ground. Bend over and place a palm on the bench to support yourself " +
                            "(the hand on the same side of the body as the knee that’s on the " +
                            "bench) and hold the dumbbell with the other hand. With your palm " +
                            "facing in toward your body, raise your elbow to waist height and " +
                            "bring it tight to your side. Extend your hand back to create a straight " +
                            "arm, keeping your elbow still, and hold for a moment before slowly " +
                            "returning your arm to a 90 degree angle.",
                    modifier = Modifier.padding(10.dp, 0.dp),
                )
            }
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 0.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                )
            )
            {
                Box {
                    val image = painterResource(id = R.drawable.upperbody9)
                    Image(
                        painter = image,
                        contentDescription = null, alignment = Alignment.BottomEnd,
                        modifier = Modifier.alpha(0.8f),
                    )
                }
                Text(
                    text = "3 Round of 20: Push-Ups",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Begin in a plank position with your arms and hands directly under " +
                            "shoulders, body straight and maybe your hips raised slightly above " +
                            "your legs if you have trouble keeping your back from sagging. It’s " +
                            "better to have a slight upside down v-shape than to have your back " +
                            "in a compromising position. Begin bending your elbows to lower your " +
                            "entire body almost to the floor. Reverse the motion and return to a " +
                            "high plank to complete the exercise. If you have limited upper body " +
                            "strength, or previous shoulder injuries, you may want to drop your " +
                            "knees to the ground to reduce the amount of stress on your shoulders " +
                            "and back.",
                    modifier = Modifier.padding(10.dp, 0.dp),
                )
            }
            Text(
                text = "Lower Body Exercise",
                modifier = Modifier.padding(10.dp, 15.dp, 0.dp, 0.dp),
                color = Color(146, 144, 195),
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 0.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                )
            )
            {
                Box {
                    val image = painterResource(id = R.drawable.lowerbody1)
                    Image(
                        painter = image,
                        contentDescription = null, alignment = Alignment.BottomEnd,
                        modifier = Modifier.alpha(0.8f),
                    )
                }
                Text(
                    text = "4 Round of 18: Weighted Walking Lunges",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Start standing upright with a dumbbell in each hand. Step forward " +
                            "about one and a half the length of a walking stride, and begin " +
                            "kneeling down so that your front leg reaches 90 degrees. Don’t let " +
                            "your back knee hit the ground. Straighten back up to a standing " +
                            "position by raising up and bringing your back leg to meet your front. " +
                            "Repeat with the other leg. Both legs count as one repetition.",
                    modifier = Modifier.padding(10.dp, 0.dp),
                )
            }
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 0.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                )
            )
            {
                Box {
                    val image = painterResource(id = R.drawable.lowerbody2)
                    Image(
                        painter = image,
                        contentDescription = null, alignment = Alignment.BottomEnd,
                        modifier = Modifier.alpha(0.8f),
                    )
                }
                Text(
                    text = "4 Round of 8: Barbell Dead Lifts",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Stand tall with a barbell on the floor in front of you, feet hip width " +
                            "apart and toes pointed forward. Keep your back as straight as " +
                            "possible and bend at the knees reaching down to grab the barbell. " +
                            "This is the starting position. Grip the bar and push through your" +
                            "legs. Keep your torso upright and return to a standing position while " +
                            "pushing your chest out and squeezing your shoulder blades together. " +
                            "Return to the starting position tapping the barbell on " +
                            "the ground.",
                    modifier = Modifier.padding(10.dp, 0.dp),
                )
            }
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 0.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                )
            )
            {
                Box {
                    val image = painterResource(id = R.drawable.lowerbody3)
                    Image(
                        painter = image,
                        contentDescription = null, alignment = Alignment.BottomEnd,
                        modifier = Modifier.alpha(0.8f),
                    )
                }
                Text(
                    text = "4 Round of 10: Back Extensions",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Position your body on a back extension machine so that you are " +
                            "facing the ground with the padded support at hip bone height. You " +
                            "should be able to bend forward to a 90 degree angle comfortably " +
                            "so that the weight of your body is supported by your upper thighs " +
                            "pressing against the pad. Hold a weight plate or two dumbbells " +
                            "against your chest with both hands and slowly bend at the hip joint " +
                            "until your upper body is at a 90 degree angle to your lower body. " +
                            "Contract your hamstrings and glutes to pull your upper body back to " +
                            "a straight position. If possible, position the back extension machine " +
                            "so that you are sideways to a mirror and can view your form to be " +
                            "sure you are not overextending your lower back. You want to return " +
                            "only to a neutral spine, and no farther.",
                    modifier = Modifier.padding(10.dp, 0.dp),
                )
            }
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 0.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                )
            )
            {
                Box {
                    val image = painterResource(id = R.drawable.lowerbody4)
                    Image(
                        painter = image,
                        contentDescription = null, alignment = Alignment.BottomEnd,
                        modifier = Modifier.alpha(0.8f),
                    )
                }
                Text(
                    text = "4 Round of 10: Dumbbell Sumo Squats",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Stand with feet more than shoulder width apart, toes pointed out. " +
                            "Hold a dumbbell by the base and begin to squat down, keeping chest " +
                            "out and torso upright until thighs are parallel with the floor. Push up " +
                            "through your heels to return to standing. Squeeze glutes at the end " +
                            "and repeat.",
                    modifier = Modifier.padding(10.dp, 0.dp),
                )
            }
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 0.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                )
            )
            {
                Box {
                    val image = painterResource(id = R.drawable.lowerbody5)
                    Image(
                        painter = image,
                        contentDescription = null, alignment = Alignment.BottomEnd,
                        modifier = Modifier.alpha(0.8f),
                    )
                }
                Text(
                    text = "4 Round of 10: Leg Extensions",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Lie on a hamstring curl machine, or an upright sitting hamstring " +
                            "curl machine. Contract hamstrings and glutes to pull heels toward " +
                            "your glutes and hold for a moment, squeezing glutes before slowly " +
                            "extending legs to a near straight position again. Do not let legs " +
                            "overextend. Keep tension on hamstrings the whole time.",
                    modifier = Modifier.padding(10.dp, 0.dp),
                )
            }
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 0.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                )
            )
            {
                Box {
                    val image = painterResource(id = R.drawable.lowerbody6)
                    Image(
                        painter = image,
                        contentDescription = null, alignment = Alignment.BottomEnd,
                        modifier = Modifier.alpha(0.8f),
                    )
                }
                Text(
                    text = "4 Round of 10: Hamstring Curls",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Lie on a hamstring curl machine, or an upright sitting hamstring " +
                            "curl machine. Contract hamstrings and glutes to pull heels toward " +
                            "your glutes and hold for a moment, squeezing glutes before slowly " +
                            "extending legs to a near straight position again. Do not let legs " +
                            "overextend. Keep tension on hamstrings the whole time.",
                    modifier = Modifier.padding(10.dp, 0.dp),
                )
            }
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 0.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                )
            )
            {
                Box {
                    val image = painterResource(id = R.drawable.lowerbody7)
                    Image(
                        painter = image,
                        contentDescription = null, alignment = Alignment.BottomEnd,
                        modifier = Modifier.alpha(0.8f),
                    )
                }
                Text(
                    text = "4 Round of 10: Leg Press",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Sit with feet on press plate hip width apart, toes pointed straight " +
                            "forward. Push with feet, squeezing glutes until legs are almost " +
                            "straight. Pause one moment and then reverse the motion slowly " +
                            "bending legs back to starting position. Keep tension on your legs the " +
                            "whole time so that when you return to the beginning of the exercise " +
                            "there is no rest between repetitions.",
                    modifier = Modifier.padding(10.dp, 0.dp),
                )
            }
            Text(
                text = "Abs Workout",
                modifier = Modifier.padding(10.dp, 15.dp, 0.dp, 0.dp),
                color = Color(146, 144, 195),
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 0.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                )
            )
            {
                Box {
                    val image = painterResource(id = R.drawable.abs1)
                    Image(
                        painter = image,
                        contentDescription = null, alignment = Alignment.BottomEnd,
                        modifier = Modifier.alpha(0.8f),
                    )
                }
                Text(
                    text = "4 Round of 10: Bicycles",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Lie on your back and bring both knees up so legs are at a 90 degree " +
                            "angle. Place hands behind head and extend your right leg straight " +
                            "out while simultaneously crunching up to bring the elbow of the right " +
                            "elbow toward the left knee. Repeat on the opposite side. This counts " +
                            "as one repetition.",
                    modifier = Modifier.padding(10.dp, 0.dp),
                )
            }
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 0.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                )
            )
            {
                Box {
                    val image = painterResource(id = R.drawable.abs2)
                    Image(
                        painter = image,
                        contentDescription = null, alignment = Alignment.BottomEnd,
                        modifier = Modifier.alpha(0.8f),
                    )
                }
                Text(
                    text = "4 Round of 20:Dumbbell Side Bends ",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Hold a dumbbell in each hand with arms extended down by your hips. " +
                            "Slowly bend at the waist toward the left dumbbell and repeat on the " +
                            "other side",
                    modifier = Modifier.padding(10.dp, 0.dp),
                )
            }
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 0.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                )
            )
            {
                Box {
                    val image = painterResource(id = R.drawable.abs3)
                    Image(
                        painter = image,
                        contentDescription = null, alignment = Alignment.BottomEnd,
                        modifier = Modifier.alpha(0.8f),
                    )
                }
                Text(
                    text = "4 Round of 10: Leg Lifts",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Lie on your back with hands wedged under your lower back for " +
                            "support. Lift legs straight into the air so your body is at a 90 degree " +
                            "angle, with the bottom of your feet facing the ceiling. Slowly lower " +
                            "feet toward the ground, stopping before your lower back begins to " +
                            "arch. Pull belly button toward spine to tighten abs and bring the legs " +
                            "back up to an upright position.",
                    modifier = Modifier.padding(10.dp, 0.dp),
                )
            }
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 0.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                )
            )
            {
                Box {
                    val image = painterResource(id = R.drawable.abs4)
                    Image(
                        painter = image,
                        contentDescription = null, alignment = Alignment.BottomEnd,
                        modifier = Modifier.alpha(0.8f),
                    )
                }
                Text(
                    text = "4 Round of 10: Incline Sit-Ups",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Find an incline bench and hook your feet up under the roller pads. Lie " +
                            "down on the bench with your arms crossed over your chest so that " +
                            "your hands are palm down near each shoulder. Pull your upper body " +
                            "up into a seated position by contracting your abs, and immediately " +
                            "lower back down slowly.",
                    modifier = Modifier.padding(10.dp, 0.dp),
                )
            }
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 0.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                )
            )
            {
                Box {
                    val image = painterResource(id = R.drawable.abs5)
                    Image(
                        painter = image,
                        contentDescription = null, alignment = Alignment.BottomEnd,
                        modifier = Modifier.alpha(0.8f),
                    )
                }
                Text(
                    text = "4 Round of 25: Excercise Ball Crunches",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Lie on an exercise ball with your lower back supported by the ball. " +
                            "Place hands behind head and crunch up creating a hollow shape with " +
                            "your abdomen. Repeat for a count of 25.",
                    modifier = Modifier.padding(10.dp, 0.dp),
                )
            }
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 0.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                )
            )
            {
                Box {
                    val image = painterResource(id = R.drawable.abs6)
                    Image(
                        painter = image,
                        contentDescription = null, alignment = Alignment.BottomEnd,
                        modifier = Modifier.alpha(0.8f),
                    )
                }
                Text(
                    text = "4 Round of 10: Exercise Ball Pikes",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "From the start of a push-up position in a high plank, bring the front " +
                            "of the shins up to rest on the top of an exercise ball. Bring the hips " +
                            "up toward the ceiling so that the ball rolls forward toward your chest " +
                            "and you end with your body in an upside down “V” position with the " +
                            "tops of your feet resting on the ball. Slowly lower down to a straight " +
                            "plank position.",
                    modifier = Modifier.padding(10.dp, 0.dp),
                )
            }
        }
    }
}