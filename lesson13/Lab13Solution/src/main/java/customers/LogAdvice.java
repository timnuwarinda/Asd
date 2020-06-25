package customers;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LogAdvice {
	@After("execution(* customers.EmailSender.sendEmail(..)) && args(email, message)")
	public void log(JoinPoint joinpoint, String email, String message) {
		System.out.println(new Date() + " method= "
				+ joinpoint.getSignature().getName() + " email address= "
				+ email + " message= " + message);
		IEmailSender emailSender = (IEmailSender) joinpoint.getTarget();
		System.out.println("outgoing mail server = "+emailSender.getOutgoingMailServer());
	}

}
