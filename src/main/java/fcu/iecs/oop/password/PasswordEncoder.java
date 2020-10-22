package fcu.iecs.oop.password;

public class PasswordEncoder {
  
  String encode(String inputString) {
    int i;
    String s = "";
    for (i = 0; i < inputString.length(); i++) {
      switch (inputString.charAt(i)) {
        case 'A':
        case 'a':
          s += '4';
          break;
        
        case 'E':
        case 'e':
          s += '3';
          break;
          
        case 'I':
        case 'i':
          s += '1';
          break;
          
        case 'o':
        case 'O':
          s += '0';
          break;

        case 'T':
        case 't':
          s += '7';
          break;

        default:
          s += inputString.charAt(i);
      }
    }
    return s;
  }
}