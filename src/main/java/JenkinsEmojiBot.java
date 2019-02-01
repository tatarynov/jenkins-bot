import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class JenkinsEmojiBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        SendMessage message;
        long chatId;

        if (update.hasMessage() && update.getMessage().hasText()) {
            chatId = update.getMessage().getChatId();

            message = new SendMessage() // Create a message object object
                    .setText("Запускаю джобу")
                    .setChatId(chatId);

            try {
                execute(message); // Sending our message object to user
                new JenkinsApiHelper().runJob();
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public String getBotUsername() {
        return "JenkinsEmojiBot";
    }

    @Override
    public String getBotToken() {
        return "704163632:AAH8RWkD9g1JB3eNXnKvco56O78jxeUin1Y";
    }
}
