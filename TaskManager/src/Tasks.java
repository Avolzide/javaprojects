public class Tasks {

    private String task;
    private String description;
    private String dueDate;
    private int priority;

    public Tasks(){
        this.task = "Name of task";
        this.description = "Get it done";
        this.dueDate = "01/30/2025";
        this.priority = 1;
    }

    public Tasks(String task, String description, String dueDate, int priority) {

        this.task = task;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String toString() {
        return  "*** Task ***\n" + getTask() +
                "\n\n*** Description ***\n" + getDescription() +
                "\n\n*** Due Date ***\n" + getDueDate() +
                "\n\n*** Priority Level ****\n" + getPriority();
    }
}

