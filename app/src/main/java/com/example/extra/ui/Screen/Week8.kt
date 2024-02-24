package com.example.extra.ui.Screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun WeekEight (modifier: Modifier = Modifier.background(Color(7, 15, 25)),
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
                        "Week 8",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navigateToNext("phase2") }) {
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
        Column (modifier = Modifier.verticalScroll(rememberScrollState())){
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
                            text = "Circuit 2",
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
                            text = "Rest",
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
                            text = "Cardio",
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
                            text = "Circuit 4",
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
                            text = "Circuit 1",
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
                            text = "Circuit 3",
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(10.dp, 10.dp, 10.dp, 10.dp),
                        )
                    }
                }
            }
            Text(
                text = "CIRCUIT 1",
                modifier = Modifier.padding(10.dp, 15.dp, 0.dp, 0.dp),
                color = Color(146, 144, 195),
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Card(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 10.dp, 0.dp)
                    .background(Color(7, 15, 25)),
                colors = CardDefaults.cardColors(
                    containerColor = Color(146, 144, 195)
                ))
            {
                Text(text = "4 Round of 15: Standing Dumbbell Overhead Press",
                    modifier = Modifier.padding(10.dp,10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold)
                )
                Text(text = "Stand with feet hip width apart and a dumbbell in each hand, palms facing out. Bend at the elbow " +
                        "executing a bicep curl, then rotate palms out at shoulder height and finish by pushing your arms up above " +
                        "your head until the dumbbells almost touch. Your arms should not completely straighten. Reverse the " +
                        "motion and return to the starting position.",
                    modifier = Modifier.padding(10.dp,0.dp)
                )
                Text(text = "4 Round of 30: Butt Kicks",
                    modifier = Modifier.padding(10.dp,10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold)
                )
                Text(text = "Stand with feet facing forward and parallel. Begin jogging in place and bring each heel to meet your glutes." +
                        "Each time you contact one heel with a glute counts as 1.",
                    modifier = Modifier.padding(10.dp,0.dp)
                )
                Text(text = "4 Round of 20: Push-Ups",
                    modifier = Modifier.padding(10.dp,10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold)
                )
                Text(text = "Begin in a plank position with your arms and hands directly under shoulders, body straight and maybe " +
                        "your hips raised slightly above your legs if you have trouble keeping your back from sagging. It’s better " +
                        "to have a slightly inverted v-shape than to have your back in a compromising position. Begin bending " +
                        "your elbows to lower your entire body almost to the floor. Reverse the motion and return to a high plank " +
                        "to complete the exercise. If you have limited upper body strength, or previous shoulder injuries, you may " +
                        "want to drop your knees to the ground to reduce the amount of stress on your shoulders and back.",
                    modifier = Modifier.padding(10.dp,0.dp)
                )
                Text(text = "4 Round of 18: Exercise Ball Dumbbell Chest Press",
                    modifier = Modifier.padding(10.dp,10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold)
                )
                Text(text = "Hold a dumbbell in each hand against your chest and sit on an exercise ball. Lie back on the ball, slowly " +
                        "lowering your torso so your neck and upper back are supported and your glutes are holding your hips " +
                        "elevated in a tabletop position. Raise the dumbbells above your chest and rotate palms forward. Bend at " +
                        "the elbows until your arms are at 90 degrees, or your upper arms are parallel with the ground. Reverse the " +
                        "motion, pushing fists toward each other until the dumbbells almost touch.",
                    modifier = Modifier.padding(10.dp,0.dp)
                )
                Text(text = "4 Round of 15: Exercise Ball Tricep Kickback",
                    modifier = Modifier.padding(10.dp,10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold)
                )
                Text(text = "Hold a dumbbell in each hand against your chest and sit on an exercise ball. Lie back on the ball, slowly " +
                        "lowering your torso so your neck and upper back are supported and your glutes are holding your hips up " +
                        "in a tabletop position. While holding the dumbbells up above either side of your head, palms facing one " +
                        "another, bend at the elbows and let your fists come closer to your head until your forearms are parallel to " +
                        "the ground. Push arms straight to complete the exercise.",
                    modifier = Modifier.padding(10.dp,0.dp)
                )
            }
            Text(
                text = "CIRCUIT 2",
                modifier = Modifier.padding(10.dp, 15.dp, 10.dp, 0.dp),
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
                ))
            {
                Text(
                    text = "4 Round of 15: Dumbbell Squat w/ Overhead Press",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Stand with feet hip width apart, toes pointed straight forward. Holding a dumbbell in each hand at shoulder " +
                            "height, lower down into a squat until upper thighs are parallel with the ground. Raise up to standing while " +
                            "simultaneously pushing the dumbbells up, palms facing forward, until they almost touch above your head.",
                    modifier = Modifier.padding(10.dp, 0.dp)
                )
                Text(
                    text = "4 Round of 15: Bodyweight Walking Lungs",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Start from standing with feet hip width apart. Step forward about one and a half times the length of a " +
                            "walking stride, and begin kneeling down so that your front leg reaches 90 degrees. Don’t let your back " +
                            "knee hit the ground. Straighten back up to a standing position by raising up and bringing your back leg to " +
                            "meet your front. Repeat with the other leg. Both legs count as one repetition.",
                    modifier = Modifier.padding(10.dp, 0.dp)
                )
                Text(
                    text = "4 Round of 15:Jump Squats ",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Stand with your feet hip width apart and toes pointed forward. Lower into a squat until your upper thighs " +
                            "are parallel with the ground, then jump to a standing position coming up off the ground and landing gently, " +
                            "dropping right back into a squat again.",
                    modifier = Modifier.padding(10.dp, 0.dp)
                )
                Text(
                    text = "4 Round of 15: Exercise Ball Hamstring Curls ",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Lie on your back with your legs elevated and an exercise ball under your heels. Lift up at the hips to create " +
                            "a straight line down the length of your body and curl your heels toward your buttocks. Make sure your hips " +
                            "are moving up while your heels are coming in toward your torso. Slowly let your legs back out and return to " +
                            "starting position.",
                    modifier = Modifier.padding(10.dp, 0.dp)
                )
                Text(
                    text = "4 Round of 15: Bridge ",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Lie on the ground with your knees up, and feet resting on the ground hip width apart. Your heels should be " +
                            "just far enough from your glutes that you can barely touch them with the tips of your fingers. Place each " +
                            "hand on either side of your body, palm down, for support. Raise your hips up toward the ceiling until your " +
                            "body forms a straight line from your knees to your shoulders. Hold and contract your buttocks at the top " +
                            "for the count of three, then very slowly return to the ground.",
                    modifier = Modifier.padding(10.dp, 0.dp)
                )
            }
            Text(
                text = "CIRCUIT 3",
                modifier = Modifier.padding(10.dp, 15.dp, 10.dp, 0.dp),
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
                ))
            {
                Text(
                    text = "4 Round of 3x30 seconds: Plank ",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Start in a push-up position with your arms straight and your body elevated off the ground in a straight line. " +
                            "Hold this position for 30 seconds, then rest and repeat for a total of three repetitions.",
                    modifier = Modifier.padding(10.dp, 0.dp)
                )
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
                    text = "Lie on your back and bring both knees up so legs are at a 90 degree angle. Place hands behind head and " +
                            "extend your right leg straight out while simultaneously crunching up to bring the elbow of the right elbow " +
                            "toward the left knee. Repeat on the opposite side. This counts as one repetition.",
                    modifier = Modifier.padding(10.dp, 0.dp)
                )
                Text(
                    text = "4 Round of 25: Burpees",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Start by standing with your feet shoulder width apart and toes facing forward. Jump to a push-up position " +
                            "with your body straight and hands directly beneath your shoulders. Execute a push-up (if you can’t do a " +
                            "standard push-up you can drop to your knees) and then, with your hands still on the floor, jump your feet " +
                            "forward to meet them in a crouched position. Jump straight up with your arms in the air with enough force " +
                            "that your feet leave the ground, and land with your arms by your side. This counts as one full burpee.",
                    modifier = Modifier.padding(10.dp, 0.dp)
                )
                Text(
                    text = "4 Round of 20: Single Leg Dumbbell Side Bends",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Stand on your left foot only, holding your right foot off the ground. Hold a dumbbell in your left hand down " +
                            "by your side. Bend at the waist toward your left side letting the dumbbell drop down past your hip. Repeat " +
                            "on the other side with your right foot on the ground and a dumbbell in your right hand, bending to the right.",
                    modifier = Modifier.padding(10.dp, 0.dp)
                )
                Text(
                    text = "4 Round of 10: Exercise Ball pikes",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "plank, bring the front of the shins up to rest on " +
                            "the top of an exercise ball. Bring the hips up " +
                            "toward the ceiling so that the ball rolls forward " +
                            "toward your chest and you end with your body in " +
                            "an upside down “V” position with the tops of your " +
                            "feet resting on the ball. Slowly lower down to a " +
                            "straight plank position.",
                    modifier = Modifier.padding(10.dp, 0.dp)
                )
            }
            Text(
                text = "CIRCUIT 4",
                modifier = Modifier.padding(10.dp, 15.dp, 10.dp, 0.dp),
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
                ))
            {
                Text(
                    text = "4 Round of 25: Ice Skaters",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Stand with your feet slightly wider than shoulder width apart and facing forward, then crouch down until " +
                            "your knees are directly over your toes. Move your left foot to meet your right, then quickly reverse the " +
                            "motion, placing your left foot back at the starting position, and bringing your right foot to meet your left. " +
                            "Each complete movement with both legs counts as 1 repetition.",
                    modifier = Modifier.padding(10.dp, 0.dp)
                )
                Text(
                    text = "4 Round of 12: Pull-Ups",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Grip a high stationary bar with your hands slightly wider than shoulder distance apart, and palms facing " +
                            "away from you. Pull your elbows toward your midsection, bringing your body up to meet the bar, ending " +
                            "with your chin slightly above the bar. Slowly reverse the motion lowering yourself down to starting " +
                            "position. *If you can’t pull your body up from a straight hang, grab a bench or a stool and position it under " +
                            "the bar so you can jump up to a pull-up position, then slowly lower yourself with control back to the bench " +
                            "or stool.",
                    modifier = Modifier.padding(10.dp, 0.dp)
                )
                Text(
                    text = "4 Round of 3x15 seconds: Side Planks",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Lie down on your side with one elbow propping your upper body up. Stack your feet, one on top of the " +
                            "other, and lift the weight of your body up into a straight line, upper body supported by your elbow. If this " +
                            "position is too difficult to hold, you can bend and drop your lower leg so that your knee touches the ground " +
                            "to support you. This modification may require rotating your body slightly so that your chest is angled " +
                            "down.",
                    modifier = Modifier.padding(10.dp, 0.dp)
                )
                Text(
                    text = "4 Round of 25: Single Leg Calf Raises",
                    modifier = Modifier.padding(10.dp, 10.dp),
                    color = Color(7, 15, 43),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Raise one foot off the ground and wrap it around the standing calf to secure it. Hold on to a stable object, " +
                            "such as a wall or workout machine to steady your balance, and raise up onto the toe of the standing foot. " +
                            "Slowly lower back down to the ground. For an extra challenge and more calorie burn on this exercise, you " +
                            "can try doing the calf raises without holding on to a stabilizing object, and even add a dumbbell in each " +
                            "hand if you are up to it!",
                    modifier = Modifier.padding(10.dp, 0.dp)
                )
            }
        }
    }

}