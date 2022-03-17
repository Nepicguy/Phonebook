package PhoneBookPackage;

class ListNode extends PhoneBookTest{
	
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String city;
	private ListNode list;
	protected ListNode next;
	private String data;

	// constructor for Linked list
	public ListNode() {

	}

    // this method creates a linked list
	public void createList(){
		list = new ListNode();
		list.data = firstName;
		list.next = new ListNode();
		list.next.data = lastName;
		list.next.next = new ListNode();
		list.next.next.data = email;
		list.next.next.next = new ListNode();
		list.next.next.next.data = phoneNumber;
		list.next.next.next.next = new ListNode();
		list.next.next.next.next.data = city;
		list.next.next.next.next.next = null;
	}// end of createList

	// this method constructs each contact to a string
	public String toString () {
		return "Contact name = " + firstName + " "+  lastName + ", " +
				"email = " + email + ", Phone Number = " +
				phoneNumber + ", City = " + city;
	}// end of toString

	// getters for the Strings

	public String getLastName() {
		return lastName;
	}// end of getLastName

	public String getFirstName() {
		return firstName;
	}// end of getFirstName

	public String getEmail() {
		return email;
	}// end of getEmail

	public String getPhoneNumber() {
		return phoneNumber;
	}// end of getPhoneNumber

	public String getCity() {
		return city;
	}// end of getCity

	// setters for the Strings
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}// end of setFirstName

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}// end of setEmail

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}// end of setPhoneNumber

	public void setCity(String city) {
		this.city = city;
	}// end of SetCity

}// end of CLass
