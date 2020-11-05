## Part 1: Test it with SQL
select
     column_name,data_type
from
    information_schema.columns
where
 table name='job'
## Part 2: Test it with SQL
select *
 from employer
 where
 location='St Louis'
## Part 3: Test it with SQL
Drop table job
## Part 4: Test it with SQL
select distinct
 name,description
 from
 skill
  inner join
   job_skills on skill_id=job_skills.skills_id order by name