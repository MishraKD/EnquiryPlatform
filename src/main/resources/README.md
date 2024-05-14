Enquiry project is about to do enquire to our platform within certain period of time. 
It also cover count based on hit per day to platform.

src/
├── main/
│   ├── java/
│   │   └── com.paltform.enquiry/
│   │       └── com.platform.enquiry.controller
│   │           ├── controllers/
│   │           │   └── EnquiryController.java
│   │           ├── models/
│   │           │   └── Enquiry.java
│   │           ├── services/
│   │           │   └── EnquiryService.java
│   │           └── MainApplication.java
│   └── resources/

src/main/java/com/platform/enquiry/ contains your main Java codebase.
controllers/: Contains your controller classes, such as EnquiryController.java.
models/: Contains your model classes, like Enquiry.java.
services/: Contains your service classes, such as EnquiryService.java.
MainApplication.java: Contains your main application class with the main method.
src/main/resources/: Contains resource files like configuration files, property files.


Problem 1
question:we have to update the Enquiry based on the name of Enquiry

public ResponseEntity<Enquiry> updateUser(@PathVariable("id") Long id, @RequestBody Enquiry enquiry) {
		//put snippet of code to upadte Enquiry
		
	}	

problem 2
question: we need to retrive list enquiry availiable on project.

public ResponseEntity<List<Enquiry>> getAllEnquiry() {
 //add code to retrive all enquiry
}


problem 3
question: we have to delete enquiry data

public ResponseEntity<String> deleteEnquiry(){
//add code to delete enquiry
}

problem 4
question:we need to add new customer enquiry.

public ResponseEntity<Enquiry> createEnquiry(){
//add code for new enquiry
}
problem 5
question: we need to fetch enquiry deatils based on enquiryNumber.

public ResponseEntity<Enquiry> getEnquiryById(){
//add code to fetch enquiry

}



