$(document).ready(
		function() {
			$("#user_Name").change(function() {
						if ($("#user_Name").val().length > 2) {
							alert("you entered is :" + $("#user_Name").val());
							$.ajax({
								"url" : "searchUsersByName?userName="+ $("#user_Name").val(),
								success : function(userList) {
									$("#userTable tbody").html("");
									$.each(userList, function(key, user) {
										$("#userTable tbody").append("<tr><td>"+user.userId+
												"<td>"+user.userName+"</td><td>"+user.email+"<td><tr>");
									});
								}
							});
						}else{
							alert("minimum 3 alphabets required. Example: 'sai'");
							$.ajax({
								"url" : "getAllUsers",
								success : function(userList) {
									$("#userTable tbody").html("");
									$.each(userList, function(key, user) {
										$("#userTable tbody").append("<tr><td>"+user.userId+"<td>"+user.userName+"</td><td>"+user.email+"</td>"
												+"<td><a href='deleteUser?userId="+user.userId+"'><span class='glyphicon glyphicon-trash'></span></a></td>"
												+"<td><a href='updateUser?userId="+user.userId+"'><span class='glyphicon glyphicon-edit'></span></a></td><tr>");
									});
								}
							});
						}
					});
		});