Original App Design Project - README Template
===

# NCAT Career Fair App

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
An app that assist students and job seekers in navigating the career fair and add structure to the career fair experience.


### App Evaluation
- **Category:** Education/Networking
- **Mobile:** This app would be on all mobile devices (Android/iPhone) for students to navigate the career fair
- **Story:** Users would be able able to naviagate through the career fair and deligently schedule what company they visit and when they can do so.
- **Market:** College Students (NCAT)
- **Habit:** This app will be used every time NCAT hosts a career fair at their school.
- **Scope:**

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

The following are Must-have Stories:
- [x] User can login into the app
- [ ]  Users can scroll through the list of employers
- [ ]  Users can view a map of the career fair
- [ ]  Users can read a company description through the detailed screen
- [x]  User profile containing Name, Expexted Graduation, Major, Job Interest, ect.
- [x]  Users can take take notes
- [x] Users can add photos to note
- [ ]  Users can search through notes
- [ ]  Users can search based company name

**Optional Nice-to-have Stories**

* Users are able to share their contact information with employers through QR code
* Employers are able to make "anouncements" in the feed to communicate with students
* Users can label companies a favorites
* Implement google maps for navigation

### 2. Screen Archetypes

* Home Screen
   * Consists of the map of the entire career fair area.
   * Search bar
 
* Detailed Description Screen
   * Selected Company Description including their availabilty, website, and booth location.
   
* Login Screen
   * To verify NCAT student via email/Blackboard login.

* Notes Screen
   * Notes the user can take based off their experience with the career fair.

* Profile Screen
   * Contains optional photo along with name,user email address, classification, major, and other credentials.




### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Home - split between list of companies and a map of the career fair
* Notes - allow the students to take notes for each employer
* Profile/Contact - contains important information for the user

**Flow Navigation** (Screen to Screen)

* Login Screen
   * User enters in NCAT/Blackboard email and password and waits for verification to move on to the next page. For now, if the email does not end with "@aggies.ncat.edu", they will not be able to move on to the next screen.
   * ...
* Home Page
   * There are 2 main sections to this page. The top half willprovide the user the map of the career fair while the bottom half will contain the list of companies there. Note that there will be a navigation bar that contains the the home, notes, and profile page.
  
* Notes Page
    * A user will access this page from the bottom 3 tabs. They would be able access this from both the home page and contact page.
    * A creation screan is used to make new notes. capture photos
    * all notes are seen in a stream view 

## Wireframes
[Add picture of your hand sketched wireframes in this section]
<img src='https://i.imgur.com/XOB9Zzy.jpeg' width=600>

### [BONUS] Digital Wireframes & Mockups
<img src='https://i.imgur.com/j1Pi2gu.jpeg' width=600>
### [BONUS] Interactive Prototype
<img src='https://i.imgur.com/xuqyw0x.gif' width=600>

## Schema 
### Models
<img src='https://i.imgur.com/4LhSp01.jpeg' width=600>
<img src='https://i.imgur.com/BFOQLFY.jpg' width=600>
<img src='https://i.imgur.com/98B2Gh8.jpg' width=600>
<img src='https://i.imgur.com/PelPj8T.jpg' width=600>

### Networking
### List of networking requests by screen
  * Adding notes in the note section
* (Read/GET) Query all posts where user is author
* let query = PFQuery(className:"Post")
* query.whereKey("author", equalTo: currentUser)
* query.order(byDescending: "createdAt")
* query.findObjectsInBackground { (posts: [PFObject]?, error: Error?) in
   * if let error = error { 
      *print(error.localizedDescription)
   * } else if let posts = posts {
      *print("Successfully retrieved \(posts.count) posts.")
  * // TODO: Do something with posts...
   * }
* }
* (Create/POST) Create a new note 
* Create Post Screen
* (Create/POST) Create a new post object
* Profile Screen
* (Read/GET) Query logged in user object
* (Update/PUT) Update user profile image

- [Create basic snippets for each Parse network request]
- [OPTIONAL: List endpoints if using existing API such as Yelp]

### Sprint 1 Gif
<img src='https://i.imgur.com/PS5g9Bq.gif' width=600>
