# Spring-angular_crudAndTestUnitairescommans:pour executer le projet
mvn spring-boot:run -D spring-boot.run.profiles=dev,appliinfo    //lancer l'execution 

//cree une branche
git checkout -b feat/nom_du_brnache
git branch //demande la branche actuelle


pour basculer sur une branche:

git fetch origin nom_du_brache
git checkout --track origin/nom_du_brache


git stash // commit de cash
git checkout develop
git pull origin develop
git checkout nomDuBranche
git stash apply
git status
git add .
git commit -m "nomDuBranche: le travail effectue"
git push origin nomDuBranche



    git config --global user.name "ntaher"
    git config --global user.email noureddine.taher-externe@adsn.fr
    git commit --amend --reset-author

pour avoir un pull sur la branche
git log --oneline // avoir liste des commit sur une branche
git status
git commit -am "vos commit"
git pull 



pour creer un pull request:

on fait un pull sur la brache develop
on fait un rebase dans la branche à poussée sur la branche develop.
on fait un commit puis un push
on fait un pull request



Sql:
SELECT * FROM incident WHERE INCIDENT_NUMBER=2 order by id desc;
SELECT * FROM incident WHERE(id=(SELECT max(id) FROM incident)) AND (INCIDENT_NUMBER=2);
SELECT * FROM incident WHERE(INCIDENT_NUMBER=4)
SELECT * FROM incident WHERE INCIDENT_NUMBER=1 OR INCIDENT_NUMBER=4 order by INCIDENT_NUMBER desc
DROP TABLE incident;





