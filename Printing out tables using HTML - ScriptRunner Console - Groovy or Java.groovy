//This script was built for the Atlassian Jira and Confluence add-on called ScriptRunner
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Created - 24th April 2023, 08:26 pm
//Last Modified - 24th April 2023, 08:35 pm
//Authors - Rinaldi Michael
//References -
//https://www.w3schools.com/tags/tag_table.asp
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
String printtext=""
 
 
//Header start
printtext+="<html> <head>"
 
//Style and Header end
printtext+= "<style> table,th,td{border: 1px solid black;border-collapse: collapse;}     table.center {margin-left: auto;margin-right: auto;}    th,td{padding:10px;} </style> </head>"
 
//body start
printtext+="<body>"
 
//table
printtext+="<table>"
printtext+="<tr style=\"background-color:#ff0800;color:#ffee00\"><th>Column 1</th><th>Column 2</th></tr>"  //row 1 header
printtext+="<tr><td>Value 1</td><td>Value 2</td></tr>"   //row 1 values
printtext+="<tr><td>Value 3</td><td>Value 4</td></tr>"   //row 2 values
printtext+="</table>"
 
//body end
printtext+="</body>"
 
//html end
printtext+="</html>"
 
return printtext
