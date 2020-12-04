select *
 from mantis_bug_table
 where usuario = '$usuario'


--TRUNCATE 'mantis_bug_table';
--TRUNCATE 'mantis_bug_tag_table';
--TRUNCATE 'mantis_bug_text_table';
--TRUNCATE 'mantis_category_table';
--TRUNCATE 'mantis_custom_field_table';
--TRUNCATE 'mantis_filters_table';
--TRUNCATE 'mantis_project_table';
--TRUNCATE 'mantis_tag_table';
--TRUNCATE 'mantis_user_profile_table';

--BEGIN;
--TRUNCATE TABLE mantis_filters_table;
--TRUNCATE TABLE mantis_bug_text_table;
--TRUNCATE TABLE mantis_bug_table;
--TRUNCATE TABLE mantis_tag_table;
--TRUNCATE TABLE mantis_bug_tag_table;
--TRUNCATE TABLE mantis_custom_field_table;
--TRUNCATE TABLE mantis_user_profile_table;
--TRUNCATE TABLE mantis_project_table;
--TRUNCATE TABLE mantis_category_table;
--#DELETE FROM mantis_category_table WHERE id !=1;
--COMMIT;





--BEGIN;
--#Criar um  projeto em base
--INSERT into mantis_project_table (NAME,description,inherit_global) values ('Proj Trigger' , 'Descrition Trigger', 1) ;
--#Criar uma tarefa base
--INSERT INTO mantis_bug_table
--(project_id,reporter_id,handler_id,duplicate_id,priority,severity,reproducibility,STATUS,resolution,projection,
--eta,bug_text_id,os,os_build,platform,version,fixed_in_version,build,profile_id,view_state,summary,sponsorship_total,sticky,target_version,
--category_id)
--VALUES(1,1,0,0,30,50,70,10,10,