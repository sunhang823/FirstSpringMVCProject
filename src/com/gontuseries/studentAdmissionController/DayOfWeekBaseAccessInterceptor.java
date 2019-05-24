package com.gontuseries.studentAdmissionController;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBaseAccessInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		Calendar cal = Calendar.getInstance();
		
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK);
		// 1 means Sunday 2 means Monday ... 7 means Saturday
		if(dayOfWeek ==  1) {
			
			response.getWriter().write("The Website is closed on Sunday; please try accressing it on any other day!!");
			
			return false;
		}
		
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		
		System.out.println("HandlerInterceptorAdapter : Spring MVC Called postHandle method for " + request.getRequestURI().toString());
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		
		System.out.println("HandlerInterceptorAdapter : Spring MVC Called afterCompletion method for " + request.getRequestURI().toString());
		
	}
}
