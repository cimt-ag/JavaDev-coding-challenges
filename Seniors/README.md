# Seniors
This coding challenge is designed for interviews with candidates to a position as senior consultant.

# Tasks

## Section 1 - Get comfortable
- Import the project into an IDE and perform a maven build
- Start the application
- Navigate to http://localhost:8080/swagger-ui/index.html and perform a POST and GET request via the UI
- Stop and restart the application. Verify that the GET request still returns data and explain why

## Section 2 - Testing
- Explain which components of this application are being tested by the class PetDatabaseAdapterIntegrationTest
- Elaborate the question, of whether you consider this to be a good scope for a test and suggest an alternative
- Implement the stubbed testing method in this test class

## Section 3 - Architecture
- The "pet" model can be found several times: Pet.java, PetEntity.java and PetWebModelItem.java. Elaborate on possible reasons for this, as well as possible advantages/disadvantages
- Add a logging command that logs the name of a newly registered pet. You may use @Slf4j. Justify your choice of class to perform the logging in (controller, service or database-adapter)
- The Pet Shop does not want to accept pets of the type "crocodile". Adjust the implementation so no crocodiles can be registered and users trying to do so via the web interface receive a Bad Request error
- Create a component that listens to a (non existent) RabbitMQ-Queue of name "registerPet". Make sure any new packages match the package structure already existing in the project. (Since no queue actually exists, this does not have to actually work)