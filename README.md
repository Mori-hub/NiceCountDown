
# Nice Count Down 

This is kind of a countdown function. It uses nice digital counters.
## Features

- Min and Sec 
- Optional Buttons : Pause and Stop 
- Free size : Relative Layout
- Free background color 
- Easy Theme : Wooden, Classic, Happy, Balck, Neon, Simple
- Get Running Function :Repeatdly to do
- Get Finish Function: Such as handler.removeCallbacks(runnable)  


## ⚙Installation

Install my-project with https://jitpack.io/

```bash
  dependencies {
	        implementation 'com.github.Mori-hub:NiceCountDownr:1.0.0'
	}
```
## Version 
[![](https://jitpack.io/v/Mori-hub/NiceCountDown.svg)](https://jitpack.io/#Mori-hub/NiceCountDown)

## Usage

```javascript
    // Call Lib 
    val countView = CountView(
            this    // Add the Activity
            ,R.id.timerPosition,  // Layout must be Relative Layout ! as a Parent
            {Toast.makeText(this, "It's Finish", Toast.LENGTH_SHORT).show()} //Function after finish
            , null  // Function in Running time, Repeatedly !!!
            , "wooden"  // You can choose a theme or null
        )

    // When you call this method , the timer will start !

        countView.startTimer(0, 20)
```
## Explain
* **Parent Layout** : This must be a Relative Layout and put anywhere
* **null** : For Running Function and Finish Function
* **Show Timer**: When you call main method, the layout will attach to the window 
* **startTimer**: When you call this method , the timer will start !
## Examples
```javascript
        findViewById<Button>(R.id.start).setOnClickListener {
            countView.startTimer(1, 20) // set time by Min and Sec --> 1:20

        }
```

## 🗄Optinal Buttons

```javascript
    countView.buttons(
            findViewById<Button>(R.id.stop), // Optional Button , For Stop the timer
            findViewById<Button>(R.id.pause))// Optional Button , For Pause the timer
```


## 🎬Screenshots & Gifs

<img src="https://user-images.githubusercontent.com/53067774/161928802-a8776940-eac1-4cad-bb1e-e1f1191ed244.jpg" width="18%"></img> <img src="https://user-images.githubusercontent.com/53067774/161928849-68032390-744e-47a8-803f-00654cbb7efb.jpg" width="18%"></img> <img src="https://user-images.githubusercontent.com/53067774/161928889-6238efcc-653e-4463-b564-5f1c8d754cf3.gif" width="18%"></img> <img src="https://user-images.githubusercontent.com/53067774/161928895-45488b46-10d1-4238-a764-bc21cc25cac3.gif" width="18%"></img> <img src="https://user-images.githubusercontent.com/53067774/161928907-139ea1f6-4572-4037-9ded-d2b9ab8857ba.gif" width="18%"></img> 


## 🚀 About Me
I'm a full stack developer...


## 🛠 Skills
Java, Kotlin, CSS....


## Tech Stack

**Important:** For Gradle 7.2 & jitpack.io Please use this way : https://stackoverflow.com/a/71603699/12272687

**Update:** March 2022


## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/Mori-hub)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/)
[![Google](https://img.shields.io/badge/My%20Apps-Google%20Play%20Store-green?style=for-the-badge&logo=googleplay)](https://play.google.com/store/search?q=pub:Smart%20rabit&c=apps)

## Feedback

If you have any feedback, please reach out to us at SR-App@outlook.com


## License

[MIT](https://choosealicense.com/licenses/mit/)

