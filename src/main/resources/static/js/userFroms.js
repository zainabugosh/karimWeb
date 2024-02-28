$(document).ready(function () {
    // Function to add a new row to the users table
 /*   function addRow(user) {
        $("#usersList").append("<tr><td>" + user.id + "</td>" +
            "<td>" + user.userName + "</td>" +
            "<td>" + user.email + "</td>" +
            "<td>" + user.password + "</td>" +
            "<td>" +
            "<button onclick='findUserById(" + user.id + ")'>" + "Profile" + "</button>" +
            "</td>" +
            "</tr>");
    }

    // AJAX request to fetch all users
    $.ajax({
        type: "GET",
        url: "/users/getAll",
        success: function (users) {
            const usersList = $("#usersList");
            // Iterate through users and append rows to the table
            users.forEach(function (user) {
                addRow(user); // Call addRow function to append each user to the table
            });
        },
        error: function (error) {
            console.error("Error fetching user data: ", error);
        }
    });
*/
    // Form submission for user sign-up
    $("#signupForm").submit(function (event) {
        event.preventDefault();
        let user = {
            userName: $("#userName").val(),
            email: $("#email").val(),
            password: $("#password").val(),
        };

        // AJAX request to add a new user
        $.ajax({
            type: "POST",
            url: "/users/addUser",
            contentType: "application/json",
            data: JSON.stringify(user),
            success: function () {
                alert("User saved successfully!");
               // addRow(user); // Add the new user to the table
            },
            error: function (error) {
                console.error("Error saving user: ", error);
            }
        });
    });
/*
    // Function to find a user by ID
    function findUserById(id) {
        $.ajax({
            type: "GET",
            url: "/user/findUserId/" + id,
            success: function (user) {
                alert("User found successfully. ID: " + user.id);
                window.location.href = "/profile.html?id=" + user.id;
            },
            error: function (error) {
                console.error("Error finding user: ", error);
            }
        });
    };

*/

})