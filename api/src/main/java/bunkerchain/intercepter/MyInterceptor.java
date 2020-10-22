package bunkerchain.intercepter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.stereotype.Component;

@Component
public class MyInterceptor implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("timeFilter init !");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("timeFilter start");
        long start = System.currentTimeMillis();
        chain.doFilter(request,response);
        System.out.println("timeFilter耗时:"+(System.currentTimeMillis()-start));
        System.out.println("timeFilter stop");
    }

    @Override
    public void destroy() {
        System.out.println("timeFilter destory!");
    }
}