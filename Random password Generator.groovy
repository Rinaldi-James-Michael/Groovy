//Author: Rinaldi Michael
//Last Modified: 14th Dec 2022
//Password from length 6 to 100
 
import java.io.*
import java.lang.*
 
String passwords=""
            Random rnd = new Random()
            int randomNumber = rnd.nextInt(100)
            if(randomNumber==0 || randomNumber<6)
                randomNumber+=6
            String[] passwordCharacters=["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"
                      ,"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"
                      ,"!","@","%","^","&","*","(",")","-","+","=",".","/",">","<",";",":","|","?","~"]
     
            for(int p=0;p<randomNumber;)
            {
                try
                {
                passwords = passwords+passwordCharacters[rnd.nextInt(passwordCharacters.size())]
                p++
                }
                catch(Exception ex)
                {
                    p++
                }
            }
 
return passwords
