package com.aghajari.shared;

import com.aghajari.shared.models.OpenedChatModel;
import com.aghajari.shared.models.ServerModel;

import java.io.Serializable;
import java.util.ArrayList;

public class ChatsList implements Serializable {
    private static final long serialVersionUID = 8687362581122892285L;

    public ArrayList<OpenedChatModel> openedChats = new ArrayList<>();
    public ArrayList<ServerModel> servers = new ArrayList<>();
}
