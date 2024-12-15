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

interface LeaveApprover {
    void setNextApprover(LeaveApprover nextApprover);
    void approveLeave(LeaveRequest leaveRequest);
}