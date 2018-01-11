public static String scrambleWord(String word)
{
  for(int i = 1; i < word.length(); i++)
    if("A".equals(word.substring(i-1, i)) &&
        ! "A".equals(word.substring(i, i+1)))
    {
      word = word.substring(0, i-1) +
             word.substring(i, i+1) +
             word.substring(i-1, i) +
             word.substring(i+1);
      i++;
    }

    return word;
}
