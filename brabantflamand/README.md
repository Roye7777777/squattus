# BrabantFlamand

How to start the BrabantFlamand application
---

1. `Project > clean...` to clean the app.

2. Check if a java application is set for this project that the project can use to run. Create one if not.

3. Check in `run > run configurations...`, in the tab `arguments`, if  `program arguments` contains `server`. If not, add it anyway.

4. Go to Package Explorer (`window > show view > Package Explorer`), right click `brabantflamand`, `run as...`, `maven build` and make sure `goals` contains `package`. 

5. Right click `brabantflamand` again, `run as...`, `Java Application`. Pick the java application you have set up (see 1).

6. Use a REST API-client like Postman or Insomnia to perform requests on this app by using `localhost:8080`. 