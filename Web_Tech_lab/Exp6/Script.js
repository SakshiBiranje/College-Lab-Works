function calculateAge(dob) {
    const today = new Date();
    const birthDate = new Date(dob);
    let age = today.getFullYear() - birthDate.getFullYear();
    const m = today.getMonth() - birthDate.getMonth();
    if (m < 0 || (m === 0 && today.getDate() < birthDate.getDate())) {
        age--;
    }
    return age;
}

function validateForm() {
    var name = document.getElementById("name").value;
    var voterId = document.getElementById("voterid").value;
    var dob = document.getElementById("dob").value;
    var email = document.getElementById("email").value;
    var address = document.getElementById("address").value;
    var gender = document.querySelector('input[name="gender"]:checked');


    if (name == "" || voterId == "" || dob == "" || email == "" || address == "" || !gender) {
        alert("All fields are required.");
    } else if (!/^[a-zA-Z\s]+$/.test(name)) {
        alert("Name can only contain letters and spaces.");
    } else if (!/^[A-Z0-9]{10}$/.test(voterId)) {
        alert("Voter ID must be 10 characters long and contain only letters and numbers.");
    } else if (!/^\S+@\S+\.\S+$/.test(email)) {
        alert("Please enter a valid email address.");
    } else {

        var age = calculateAge(dob);
        document.getElementById("age").value = age;


        var genderValue = gender.value;
        alert("Form submitted successfully!");
    }
}