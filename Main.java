public boolean startHi(String str) {
 if (str.length() < 2) {
  return false;
 }
 StringBuilder sb = new StringBuilder(str);
 String subString = sb.substring(0, 2);
 if (subString.contains("hi")) {
  return true;
 }
 return false;
}
