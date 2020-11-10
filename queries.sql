## Part 1: Test it with SQL

id int(11) PK
employer varchar(255)
name varchar(255)
skills varchar(255)



## Part 2: Test it with SQL

SELECT * FROM techjobs.employer
where location = "Saint Louis;



## Part 3: Test it with SQL

DROP TABLE job;

## Part 4: Test it with SQL

SELECT skill.name, skill.description
from skill
left join job_skills on skill.id = job_skills.skills_id
where job_skills.skills_id IS NOT NULL
ORDER BY NAME ASC;
