/*
* David Cortinez
* Module 7 Lab 4
* Purpose: You have been given a leave approval program that uses the Chain of Responsibility pattern to handle leave requests.
*
* *** outline ***
*
* Implement a new handler called CEO that represents the Chief Executive Officer in the leave approval process. The CEO can approve any leave request less than 30 days. if over 30 days - reject leave request.

Update the Main class to include the new CEO handler in the chain of responsibility.

Modify each approver to have the system output a message that the leave request needs to be moved to the next requester in the event the leave request exceeds the amount of leave the approver is authorized to approve

Test your implementation by creating leave requests with various durations and verifying that each request is approved by the appropriate handler in the chain.
 */

public class CEO implements LeaveApprover{

    private LeaveApprover nextApprover;
    public void setNextApprover(LeaveApprover nextApprover) {
        this.nextApprover = nextApprover;
    }
    //Less than or equals to 30 days for CEO approval
    public void approveLeave(LeaveRequest leaveRequest) {
        if (leaveRequest.getDays() <= 30) {
            System.out.println("Leave approved by CEO");
        } else if (nextApprover != null) {
            nextApprover.approveLeave(leaveRequest);
        } else {
            System.out.println("Leave rejected");
        }
    }
}
