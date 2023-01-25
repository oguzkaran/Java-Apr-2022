/*-----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte return edilmeden önce try yazısı ekleneceğinden çıktı footryfinally biçiminde olur. Örnekte durumun
    anlaşılması içinn MutableString sınıfı yazılmıltır. Sınıf daha iyi yazılabilir. Sadece konuya odaklanınız
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        System.out.println(Sample.foo("foo")); //footryfinally
    }
}

class Sample {
    public static MutableString foo(String str)
    {
        MutableString result = new MutableString(str);

        try {
            return result.append("try");
        }
        finally {
            result.append("finally");
        }
    }
}

class MutableString {
    private String m_str;

    public MutableString(String str)
    {
        m_str = str;
    }

    public void setStr(String str)
    {
        m_str = str;
    }

    public String getStr()
    {
        return m_str;
    }

    public MutableString append(String str)
    {
        m_str += str;

        return this;
    }

    //...

    public String toString()
    {
        return m_str;
    }
}

