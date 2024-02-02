package programs;

public class CharacterCases {
    static String changeCharacterCase(String str)
    {
        if(str==null||str.isEmpty())
        {
            return null;
        }
        char[] charArr=str.toCharArray();
        for(int i=0;i<charArr.length;i++)
        {
            char ch=charArr[i];
            if(Character.isUpperCase(ch))
            {
                charArr[i]=Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch))
            {
                charArr[i]=Character.toUpperCase(ch);
            }

        }
        return new String(charArr);
    }

}
