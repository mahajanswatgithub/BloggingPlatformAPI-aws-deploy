### Frameworks and language used 
* SpringBoot Framework 
* java 

### Data Flow
* Controller - RestController
 
  Used with @GetMapping, @PostMapping,@DeleteMapping, @RequestBody,@PathVaraiable,@Validated,@RequestParam,@Valid and @Autowired which is linked with business logic in service class.

* Services

  1. UserService

     i. SignUp User

     ii. SignIn User

     iii. SigOut User

     iv. Create Blog Post

     v. Remove Blog Post

     vi. Add Comment

     vii. Authorize Comment Remover

     viii. Remove Blog Comment

     xiii. Follow User

     xiv. Get All Posts of user

     xv. Get All Users


  2. PostService

     i. Create Blog Post

     ii. Remove Blog Post

     iii. Validate Post

     iv. Get Post By Id


  4. FollowService

     i. Start Following

     ii. Is Follow Allowed

  5. CommentService

     i. Add Comment

     ii. Find Comment

     iii. Remove Comment

  6. AuthenticationService

     i. Authenticate

     ii. Save AuthToken

     iii. Find First By User

     iv. Remove Token

     
* Repository

  JpaRepository

### DataBase Design
![ER-BloggingAPI-DFD](ER-BloggingAPI-DFD.png)

### Data Structure used in your project

* Arraylist

### Database used in your project
 
* MYSQL-database

### Project Summary

* This is "Blogging Platform API Backend" Application which follows MVC-architecture.I have created this project by using spring initilizer by taking 7 dependency i.e., lombok, spring web, Mysql, JPA, Email, swagger,and Validation. In my model package I have User, Authentication, Follow, Post, Comment class which has all its related data.
* We can signUp and signIn in this Blog App for creation of account.
* We can comment, and Follow User
* We can update the Post Information of user using userId.
* Posting of post is also possible by this application.
* We can also Remove posts and comments of a post owner.
* If we want to deactivate this account for particular timeline then we can able to sign out from this application as well.

