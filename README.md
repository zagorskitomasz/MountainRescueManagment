# CRUD web application for mountain rescue operations management.

# Requirements:
- Adding/removing rescuers in database
- Tracking rescuers on duty, on action and on leave
- Creating rescue operation (assingning commander + rescuers)
- Tracking operations
- Archive of past operations and retired rescuers
- Analyzing data about operation, results, most active rescuers, commanders etc.
- Different roles of users: guest (access only to rescuers list), user (access to operations and rescuers details), officer (creating and managing operations, adding and removing rescuers)

# Technologies:
- Spring (Boot, MVC, Security)
- Hibernate
- MySQL
- Bootstrap

# Done:
- database (rescuer, action, details, join table)
- springboot starter project
- config
- entities
- DAOs (generic abstract + interfaces + implementations)
- services
- controllers

# TODO:
- frontend (in progress)
- debug (in progress)
- security
- security debug
- deploy
