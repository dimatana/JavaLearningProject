package md.dimatanasciuc.gitworkflow;

public class GitWorkFlow {
    public static void main(String[] args) {
        String step1 = "Perform git stash - to store uncomitted changes";
        String step2 = "Perform git checkout master - to move to the local master branch";
        String step3 = "Perform git fetch command - to fetch the origin branches";
        String step4 = "Perform git pull command - this will download the latest changes from origin/master to local master";
        String step5 = "Perform git checkout -b new_branch_name command - to create and instantlu move to a new branch, " + "that is identical to local master branch";
        String step6 = "Add new changes that related to the task";
        String step7 = "Review your changes and check your code before commiting them";
        String step8 = "Execute git commit by using Intellij interface, where you can select what changes you want to commit";
        String step9 = "Once all the changes are commited, execute a git push command by using CTRL+ALT+K hot keys";
        String step10 = "The commited changes are pushed to an origin branch with the same name, navigate to the GitHub branch";
        String step11 = "Create a pull request from origin/new_branch_name into origin/master";
        String step12 = "Add the pull request details - name, description and request review from your colleagues";
        String step13 = "If you collect at least 1 approval from your colleagues then merge the branch";
        String step14 = "If someone ask for changes then we should open the project and make sure that we are on the same New_Branch_Name branch";
        String step15 = "Change the requested line of code";
        String step16 = "Perform a git commit amend to change the latest executed by adding your requested changes";
        String step17 = "Perform a git force push to update the status of pull request";
        String step18 = "After that, the origin/master contains the latest changes and the origin/new_branch_name can be deleted";
        String step19 = "Do not forget that locally you are still on the new_branch_name, it's good to move back to master";
        String step20 = "However, the local master branch does not have the latest changes, therefore perform a git fetch and git pull";
        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step13);
        System.out.println(step14);
        System.out.println(step15);
        System.out.println(step16);
        System.out.println(step17);
        System.out.println(step18);
        System.out.println(step19);
        System.out.println(step20);

    }
}
