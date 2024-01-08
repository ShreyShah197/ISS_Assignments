function validateForm() {
    const emailInput = document.getElementById("mail");
    const phoneInput = document.getElementById("phone");
    const emailError = document.getElementById("email-error");
    const phoneError = document.getElementById("phone-error");
    var x=phoneInput.lenght;

    let isValid = true;

    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(emailInput.value)) {
      emailError.textContent = "Please enter a valid email address.";
      isValid = false;
    } else {
      emailError.textContent = ""; 
    }


    if (!phoneInput.value.trim() || x!=10) {
      isValid = false;
    } else {
      phoneError.textContent = "";
    }

    return isValid;
  }

