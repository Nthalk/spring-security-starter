function component(name, location, jsName) {
    location                     = location || name;
    jsName                       = jsName || name;
    var template;
    component.componentLoadIndex = 0;

    Vue.component(name, function (resolve) {
        var componentLoad     = "_componentLoad" + (component.componentLoadIndex++);
        var counter           = 2;
        window[componentLoad] = function () {
            counter--;
            if (counter == 0) {
                window[jsName].template = template;
                resolve(window[jsName]);
                delete window[componentLoad];
            }
        };
        $("<link/>")
            .appendTo("head")
            .attr({
                      rel:  "stylesheet",
                      href: contextPath + "vue/" + location + ".vue.css"
                  });
        $("<script/>")
            .appendTo("head")
            .attr({
                      src:    contextPath + "vue/" + location + ".vue.js",
                      onload: componentLoad + "()"
                  });
        $.get(contextPath + "vue/" + location + ".vue.html").then(function (content) {
            template = content;
            window[componentLoad]();
        });
    });
}
