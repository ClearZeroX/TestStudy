import com.zlc.quartz.QuartzManager;
import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

public class NoticeJob implements Job {
    private static Logger logger = Logger.getLogger(NoticeJob.class);
    private static int a = 0;

    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("执行消息定时任务1。。。。" + new Date());
        a++;
        if (a == 5) {
            System.out.println("修改时间");
            QuartzManager.modifyJobTime("JobName", "JobGroupName", "syncJobTrigger", "sycJobGroup", "0/10 * * * * ?");
        }

        if (a == 10) {
            System.out.println("结束任务");
            QuartzManager.removeJob("JobName", "JobGroupName", "syncJobTrigger", "sycJobGroup");
        }

    }

}
