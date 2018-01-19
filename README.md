# ObjectRecognitionAndroidApp
This is an Android app which uses Clarifai API to recognize objects. The purpose of this application is to help the visually impaired recognize objects.

The User Interface and working of the app:

Step 1:

The application has a very simple UI so that it is easy to use for blind people with a screen reader. 
The home screen consists of just one button called CAPTURE.
The user can just say the word "CAPTURE", and since voice recognition is activated by default, camera is automatically opened.
The user has to focus the phone on the object which they want to recognize and capture the image.

Step 2:

The user has to say one out of these 5 words to choose a model:

1. General
2. Color
3. Wedding
4. Travel
5. Food

Step 3:

The image is converted into a byte array and sent to the API for recognition. According to the chosen model, the user receives a list of objects that are there in the picture based on probability.

How to choose a model? 

It is the user's choice on what model to use. For example, if the user wants to  know if there is food on the table, he/she can capture and say "GENERAL". If he/she wants to know what kind of food is on the table, he/ she should capture the image and say "FOOD". Likewise, if the user is color blind and wants to know the color of a shirt, he/she should say "COLOR".

This app was used in real-time by two people with visual impairments and were greatly appreciated.
