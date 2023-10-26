# class Academic
- both students and professors
- id generated in constructor, based on: rank, the current year & size of holding List
- personal details are added in a separate method

# class Course
- name, description and credits
- each can be assigned a professor
- each has a list of students

# class Administration
- manages the various lists of profs/studends and courses
- professors and students are created and given an id via admin
- courses are created via admin, not active until a professor is assigned
- activeCourses: have a professor assigned