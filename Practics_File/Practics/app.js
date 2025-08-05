async function deleteUser(userid) {
        if (confirm("Are you sure you want to delete this user?")) {
            const response = await fetch(`http://localhost:8080/delete/${userid}`, {
                method: 'DELETE'
            });
            if (response.ok) {
                alert("User deleted successfully");
                
    loadUsers();
            loadUsers();
            } else {
                alert("Failed to delete user");
            }
        }
    }