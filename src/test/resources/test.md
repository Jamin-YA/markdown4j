### 数据验证
```
// commons-lang
StringUtils.isNotEmpty(str)

// commons-collection
CollectionUtils.isNotEmpty(list)
MapUtils.isNotEmpty(map)
```

### 数据格式化
```
// commons-lang
DateFormatUtils.format(date, "yyyy-MM-dd HH:mm:ss")

// fastjson
String jsonStr = JSON.toJSONString(object)
Object object = JSON.parseObject(jsonStr, objectClass)

// gson

// xstream
XStream xstream = new XStream(new DomDriver("utf8"))
xstream.processAnnotations(objectClass)
String xmlStr = xstream.toXML(object)
Object object = xstream.fromXML(xmlStr)

// snakeyaml
Yaml yaml = new Yaml()
String yamlStr = yaml.dump(object)
Object object = yaml.loadAs(yamlStr, objectClass)

// markdown4j
String htmlStr = new Markdown4jProcessor().process(markdownStr);
```

### 数据模板
```
// velocity
VelocityContext context = new VelocityContext()
Velocity.evaluate(context, writer, logTag, templateStr)
Velocity.evaluate(context, writer, logTag, templateReader)
```