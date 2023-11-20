<?php

function Connect()
{
	$dbhost = "localhost:3307";
	$dbuser = "root";
	$dbpass = "";
	$dbname = "food";

	//Create Connection
	$conn = new mysqli($dbhost, $dbuser, $dbpass, $dbname) or die("Error ...sorry".$conn->connect_error);
	
	return $conn;
	
	 
}
?>