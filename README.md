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





