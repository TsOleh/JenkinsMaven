package com.epam.lab.decoratorimpl;
import com.epam.lab.decorator.Element;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;

public class LocatingCustomElementListHandler implements InvocationHandler {
    private final ElementLocator locator;

    public LocatingCustomElementListHandler(ElementLocator locator) {
        this.locator = locator;
    }
    public Object invoke(Object object, Method method,
                         Object[] objects) throws Throwable {
        List<Element> elements =  locator.findElements()
                .stream()
                .map(Element::new)
                .collect(Collectors.toList());
        try {
            return method.invoke(elements, objects);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
