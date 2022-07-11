package com.aghajari.store;

import com.aghajari.shared.models.FriendshipModel;
import com.aghajari.shared.models.IsTypingModel;
import com.aghajari.shared.models.MessageModel;
import com.aghajari.shared.models.ServerModel;
import com.aghajari.shared.models.UserModel;

public class StaticListeners {

    public static Updater updateOpenedChatsListener;
    public static Updater updateMyProfile;
    public static Updater updateOnlineStatus;
    public static GenericUpdater<FriendshipModel> friendshipUpdater;
    public static GenericUpdater<MessageModel> messageUpdater;
    public static GenericUpdater<IsTypingModel.IsTypingResponse> isTypingUpdater;
    public static GenericUpdater<UserModel> updateBlockUnblock;
    public static GenericUpdater<UserModel> updateProfileBlockUnblock;
    public static GenericUpdater<UserModel> updateProfile;
    public static GenericUpdater<ServerModel> updateServer;

    public interface Updater {
        void update();
    }

    public interface GenericUpdater<T> {
        void update(T t);
    }

}
