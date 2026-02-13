window.onload = function () {

    document.getElementById("reservationForm").addEventListener("submit", function (event) {

        event.preventDefault();

        let name = document.getElementById("name").value;
        let contact = document.getElementById("contact").value;
        let email = document.getElementById("email").value;
        let age = document.getElementById("age").value;
        let checkIn = document.getElementById("checkIn").value;
        let checkOut = document.getElementById("checkOut").value;
        let guests = document.getElementById("guests").value;
        let rooms = parseInt(document.getElementById("rooms").value);
        let roomType = document.getElementById("roomType").value;
        let payment = document.getElementById("payment").value;

        // Price logic (same as Java)
        let price = 0;

        if (roomType === "Standard") {
            price = 2000;
        } else {
            price = 4000;
        }

        // Calculate number of days
        let date1 = new Date(checkIn);
        let date2 = new Date(checkOut);
        let diffTime = date2 - date1;
        let days = diffTime / (1000 * 60 * 60 * 24);

        if (days <= 0) {
            alert("Check-out date must be after Check-in date!");
            return;
        }

        let total = price * rooms * days;

        document.getElementById("result").innerHTML =
            "<h3 style='color:green;'>Room Booked Successfully!</h3>" +
            "<hr>" +
            "<b>Reservation Details</b><br><br>" +
            "Customer Name: " + name + "<br>" +
            "Contact: " + contact + "<br>" +
            "Email: " + email + "<br>" +
            "Age: " + age + "<br>" +
            "Check-in: " + checkIn + "<br>" +
            "Check-out: " + checkOut + "<br>" +
            "Guests: " + guests + "<br>" +
            "Rooms Booked: " + rooms + "<br>" +
            "Room Type: " + roomType + "<br>" +
            "Payment Method: " + payment + "<br><br>" +
            "<b>Total Amount: ₹" + total + "</b>";

    });

};
