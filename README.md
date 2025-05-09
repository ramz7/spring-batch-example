Spring Batch is a powerful framework for handling large-volume, batch-oriented processing. It provides reusable components for reading, processing, and writing data in chunks with transaction management, retry, and skip capabilities.

This project demonstrates a simple Spring Batch job using an in-memory H2 database. It reads data from a CSV file containing 1000 person records, converts the first name and last name to uppercase, and writes the results to the database.

Use Cases of Spring Batch
1) Data migration (e.g., between databases or formats)
2) Scheduled reporting or analytics jobs
3) Processing large CSV or Excel files
4) Automated invoice

   

How to Run the Project
  1) Clone the project using git clone https://github.com/your-username/your-repo-name.git command
  2) Open project in your IDE ( make sure csv file is under src/main/resource
  3) Run this application
  4) Trigger the job by POST Request (POST http://localhost:8080/jobs/importData)
        This will:
           i) Read data from the CSV file
           ii) Convert first and last names to uppercase
           iii) Write the processed records to the in-memory H2 database

  5) View H2 console (http://localhost:8080/h2-console)

Spring Batch Default Tables
When using Spring Batch, it automatically creates several database tables used to manage and track job executions. Some of these tables include:
   1) BATCH_JOB_INSTANCE
   2) BATCH_JOB_EXECUTION
   3) BATCH_JOB_EXECUTION_CONTEXT
   4) BATCH_STEP_EXECUTION
   5) BATCH_STEP_EXECUTION_CONTEXT
      
These tables form the Job Repository, which stores metadata about job runs, such as execution status, parameters, context, and step-level details.

Disabling Default Table Creation
1) Exclude Auto Configuration
   
     
   
    @SpringBootApplication(exclude = {BatchAutoConfiguration.class})

3) Disable Schema Initialization via Properties
   
     Prevent Spring from initializing the batch schema through application properties:
   
     spring.batch.initialize-schema: never

Custom Job Repository
   Once default initialization is disabled, you can:
   
   *) Manually create the required batch tables using your own SQL scripts.
   
   *) Customize the structure of these tables to meet your application's specific needs.
   
   *) Configure a custom JobRepository if needed for advanced scenarios.






