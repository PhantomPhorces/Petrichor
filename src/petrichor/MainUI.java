package petrichor;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MainUI extends javax.swing.JFrame {

    private ChartGroup hour;
    private User currentUser;
    private char contactWho;
    private AllPlants allPlants;
    private boolean currentlyGrowth = false;

    /**
     * Creates new form MainUI with the user being signed in as
     *
     * @param SignedIn The user object that is to be signed into the application
     */
    public MainUI(User SignedIn) {
        this.setExtendedState(MAXIMIZED_BOTH);
        hour = new ChartGroup("hour.txt");
        currentUser = SignedIn;
        allPlants = new AllPlants(currentUser.getID());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        buttonsPanel = new javax.swing.JPanel();
        growthButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        statisticsButton = new javax.swing.JButton();
        contactButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        plantsButton = new javax.swing.JButton();
        displayArea = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        welcomePanel = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        homeHelp = new javax.swing.JButton();
        scrollText = new javax.swing.JScrollPane();
        homeText = new javax.swing.JPanel();
        introduction = new javax.swing.JTextArea();
        plantsDescription = new javax.swing.JTextArea();
        contact = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        homeDescription = new javax.swing.JTextArea();
        growth = new javax.swing.JLabel();
        growthDescription = new javax.swing.JTextArea();
        statistics = new javax.swing.JLabel();
        statisticsDescription = new javax.swing.JTextArea();
        plants = new javax.swing.JLabel();
        settingsDescription = new javax.swing.JTextArea();
        settings = new javax.swing.JLabel();
        contactDescription = new javax.swing.JTextArea();
        statisticsPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        temperatureButton = new javax.swing.JButton();
        humidityButton = new javax.swing.JButton();
        lightButton = new javax.swing.JButton();
        Moisture = new javax.swing.JButton();
        panelCharts = new javax.swing.JPanel();
        statisticsHelp = new javax.swing.JButton();
        plantsPanel = new javax.swing.JPanel();
        plantsLabel = new javax.swing.JLabel();
        searchbarP = new javax.swing.JTextField();
        clearTextButtonP = new javax.swing.JButton();
        searchButtonP = new javax.swing.JButton();
        plantsHelp = new javax.swing.JButton();
        plantsScrollPane = new javax.swing.JScrollPane();
        gridPanel = new javax.swing.JPanel();
        testPanel = new javax.swing.JPanel();
        plantNameLabel = new javax.swing.JLabel();
        latinNameLabel = new javax.swing.JLabel();
        temperatureLabel = new javax.swing.JLabel();
        humidityLabel = new javax.swing.JLabel();
        lightLabel = new javax.swing.JLabel();
        moistureLabel = new javax.swing.JLabel();
        temperatureValueLabel = new javax.swing.JLabel();
        humidityValueLabel = new javax.swing.JLabel();
        lightValueLabel = new javax.swing.JLabel();
        moistureValueLabel = new javax.swing.JLabel();
        descriptionScrollPane = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        contactPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        horticulturalistsPanel = new javax.swing.JPanel();
        horticulturalists = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        programmersPanel = new javax.swing.JPanel();
        programmers = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        contactHelp = new javax.swing.JButton();
        settingsPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        editCredentialButton = new javax.swing.JButton();
        informationPanel = new javax.swing.JPanel();
        mailingPanel = new javax.swing.JPanel();
        subjectField = new javax.swing.JTextField();
        messageLabel = new javax.swing.JLabel();
        mailingPageLabel = new javax.swing.JLabel();
        subjectLabel = new javax.swing.JLabel();
        messageField = new javax.swing.JTextArea();
        sendButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        mailingHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(50, 50, 50));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        basePanel.setBackground(new java.awt.Color(30, 30, 30));
        basePanel.setPreferredSize(new java.awt.Dimension(1920, 1080));

        buttonsPanel.setBackground(new java.awt.Color(50, 50, 50));

        growthButton.setBackground(new java.awt.Color(50, 50, 50));
        growthButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        growthButton.setForeground(new java.awt.Color(172, 172, 172));
        growthButton.setText("Growth");
        growthButton.setBorder(null);
        growthButton.setBorderPainted(false);
        growthButton.setContentAreaFilled(false);
        growthButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        growthButton.setFocusable(false);
        growthButton.setSelected(true);
        growthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                growthButtonActionPerformed(evt);
            }
        });

        settingsButton.setBackground(new java.awt.Color(50, 50, 50));
        settingsButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        settingsButton.setForeground(new java.awt.Color(172, 172, 172));
        settingsButton.setText("Settings");
        settingsButton.setBorder(null);
        settingsButton.setBorderPainted(false);
        settingsButton.setContentAreaFilled(false);
        settingsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsButton.setFocusable(false);
        settingsButton.setSelected(true);
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        homeButton.setBackground(new java.awt.Color(50, 50, 50));
        homeButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        homeButton.setForeground(new java.awt.Color(172, 172, 172));
        homeButton.setText("Home");
        homeButton.setToolTipText("");
        homeButton.setBorder(null);
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.setFocusable(false);
        homeButton.setSelected(true);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        statisticsButton.setBackground(new java.awt.Color(50, 50, 50));
        statisticsButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        statisticsButton.setForeground(new java.awt.Color(172, 172, 172));
        statisticsButton.setText("Statistics");
        statisticsButton.setBorder(null);
        statisticsButton.setBorderPainted(false);
        statisticsButton.setContentAreaFilled(false);
        statisticsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        statisticsButton.setFocusable(false);
        statisticsButton.setSelected(true);
        statisticsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statisticsButtonActionPerformed(evt);
            }
        });

        contactButton.setBackground(new java.awt.Color(50, 50, 50));
        contactButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        contactButton.setForeground(new java.awt.Color(172, 172, 172));
        contactButton.setText("Contact");
        contactButton.setBorder(null);
        contactButton.setBorderPainted(false);
        contactButton.setContentAreaFilled(false);
        contactButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contactButton.setFocusable(false);
        contactButton.setSelected(true);
        contactButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(50, 50, 50));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petrichor/pictures/PETRI2.png"))); // NOI18N
        jLabel1.setAutoscrolls(true);

        plantsButton.setBackground(new java.awt.Color(50, 50, 50));
        plantsButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        plantsButton.setForeground(new java.awt.Color(172, 172, 172));
        plantsButton.setText("Plants");
        plantsButton.setBorder(null);
        plantsButton.setBorderPainted(false);
        plantsButton.setContentAreaFilled(false);
        plantsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plantsButton.setFocusable(false);
        plantsButton.setSelected(true);
        plantsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plantsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(settingsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contactButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statisticsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(growthButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plantsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(growthButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statisticsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(plantsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contactButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        displayArea.setBackground(new java.awt.Color(30, 30, 30));
        displayArea.setPreferredSize(new java.awt.Dimension(1680, 1080));
        displayArea.setLayout(new java.awt.CardLayout());

        homePanel.setBackground(new java.awt.Color(60, 60, 60));
        homePanel.setPreferredSize(new java.awt.Dimension(1680, 1080));

        jLabel2.setBackground(new java.awt.Color(60, 60, 60));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome");

        homeHelp.setBackground(new java.awt.Color(60, 60, 60));
        homeHelp.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        homeHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petrichor/pictures/help-circle-outline.png"))); // NOI18N
        homeHelp.setBorder(null);
        homeHelp.setContentAreaFilled(false);
        homeHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeHelpActionPerformed(evt);
            }
        });

        welcomePanel.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        welcomePanel.setLayer(homeHelp, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout welcomePanelLayout = new javax.swing.GroupLayout(welcomePanel);
        welcomePanel.setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeHelp)
                .addGap(5, 5, 5)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1547, Short.MAX_VALUE)
                .addGap(74, 74, 74))
        );
        welcomePanelLayout.setVerticalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeHelp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollText.setBackground(new java.awt.Color(60, 60, 60));
        scrollText.setBorder(null);
        scrollText.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollText.setToolTipText("");
        scrollText.setPreferredSize(new java.awt.Dimension(17, 18));

        homeText.setBackground(new java.awt.Color(60, 60, 60));

        introduction.setEditable(false);
        introduction.setBackground(new java.awt.Color(60, 60, 60));
        introduction.setColumns(20);
        introduction.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        introduction.setForeground(new java.awt.Color(172, 172, 172));
        introduction.setLineWrap(true);
        introduction.setRows(10);
        introduction.setText("Welcome to Petrichor (Petri for short). This application has been created to improve the food crisis the world is facing by assisting rural residents that don’t necessarily have the farming capability to maintain a consistent food source.");
        introduction.setWrapStyleWord(true);
        introduction.setBorder(null);
        introduction.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        introduction.setMinimumSize(new java.awt.Dimension(0, 0));

        plantsDescription.setEditable(false);
        plantsDescription.setBackground(new java.awt.Color(60, 60, 60));
        plantsDescription.setColumns(20);
        plantsDescription.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        plantsDescription.setForeground(new java.awt.Color(172, 172, 172));
        plantsDescription.setLineWrap(true);
        plantsDescription.setRows(10);
        plantsDescription.setText("This page contains all the data that your sensor array is receiving in a graphical format. This is organised into: temperature, humidity, light and moisture (soil moisture). Furthermore, the graphs are organised into time frames from the past hour to the past year.");
        plantsDescription.setWrapStyleWord(true);
        plantsDescription.setBorder(null);
        plantsDescription.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        plantsDescription.setMinimumSize(new java.awt.Dimension(0, 0));

        contact.setBackground(new java.awt.Color(60, 60, 60));
        contact.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        contact.setForeground(new java.awt.Color(200, 200, 200));
        contact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contact.setText("Contact");
        contact.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        contact.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        contact.setMinimumSize(new java.awt.Dimension(0, 0));

        home.setBackground(new java.awt.Color(60, 60, 60));
        home.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        home.setForeground(new java.awt.Color(200, 200, 200));
        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setText("Home");
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        home.setMinimumSize(new java.awt.Dimension(0, 0));

        homeDescription.setEditable(false);
        homeDescription.setBackground(new java.awt.Color(60, 60, 60));
        homeDescription.setColumns(20);
        homeDescription.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        homeDescription.setForeground(new java.awt.Color(172, 172, 172));
        homeDescription.setLineWrap(true);
        homeDescription.setRows(10);
        homeDescription.setText("This is the home page. It will provide you  with a place to come back to if you get stuck. However, if you're really struggling with the page that you're on, the small question mark in the top corner of every page will offer help with that page.");
        homeDescription.setWrapStyleWord(true);
        homeDescription.setBorder(null);
        homeDescription.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        homeDescription.setMinimumSize(new java.awt.Dimension(0, 0));

        growth.setBackground(new java.awt.Color(60, 60, 60));
        growth.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        growth.setForeground(new java.awt.Color(200, 200, 200));
        growth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        growth.setText("Growth");
        growth.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        growth.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        growth.setMinimumSize(new java.awt.Dimension(0, 0));

        growthDescription.setEditable(false);
        growthDescription.setBackground(new java.awt.Color(60, 60, 60));
        growthDescription.setColumns(20);
        growthDescription.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        growthDescription.setForeground(new java.awt.Color(172, 172, 172));
        growthDescription.setLineWrap(true);
        growthDescription.setRows(10);
        growthDescription.setText("The growth page is designed to keep track of all the plants that you have added to your collection. It also acts as an easy way to reference the plants you need to check on, on a regular basis.");
        growthDescription.setWrapStyleWord(true);
        growthDescription.setBorder(null);
        growthDescription.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        growthDescription.setMinimumSize(new java.awt.Dimension(0, 0));

        statistics.setBackground(new java.awt.Color(60, 60, 60));
        statistics.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        statistics.setForeground(new java.awt.Color(200, 200, 200));
        statistics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statistics.setText("Statistics");
        statistics.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        statistics.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        statistics.setMinimumSize(new java.awt.Dimension(0, 0));

        statisticsDescription.setEditable(false);
        statisticsDescription.setBackground(new java.awt.Color(60, 60, 60));
        statisticsDescription.setColumns(20);
        statisticsDescription.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        statisticsDescription.setForeground(new java.awt.Color(172, 172, 172));
        statisticsDescription.setLineWrap(true);
        statisticsDescription.setRows(10);
        statisticsDescription.setText("This page contains all the data that your sensor array is receiving in a graphical format. This is organised into: temperature, humidity, light and moisture (soil moisture). Furthermore the graphs are organised into time frames from the past hour to the past year.");
        statisticsDescription.setWrapStyleWord(true);
        statisticsDescription.setBorder(null);
        statisticsDescription.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        statisticsDescription.setMinimumSize(new java.awt.Dimension(0, 0));

        plants.setBackground(new java.awt.Color(60, 60, 60));
        plants.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        plants.setForeground(new java.awt.Color(200, 200, 200));
        plants.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plants.setText("Plants");
        plants.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        plants.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plants.setMinimumSize(new java.awt.Dimension(0, 0));

        settingsDescription.setEditable(false);
        settingsDescription.setBackground(new java.awt.Color(60, 60, 60));
        settingsDescription.setColumns(20);
        settingsDescription.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        settingsDescription.setForeground(new java.awt.Color(172, 172, 172));
        settingsDescription.setLineWrap(true);
        settingsDescription.setRows(10);
        settingsDescription.setText("This page allows you to make small customisations and configurations to the application as well as changes to your account based on your preferences.");
        settingsDescription.setWrapStyleWord(true);
        settingsDescription.setBorder(null);
        settingsDescription.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        settingsDescription.setMinimumSize(new java.awt.Dimension(0, 0));

        settings.setBackground(new java.awt.Color(60, 60, 60));
        settings.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        settings.setForeground(new java.awt.Color(200, 200, 200));
        settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settings.setText("Settings");
        settings.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        settings.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        settings.setMinimumSize(new java.awt.Dimension(0, 0));

        contactDescription.setEditable(false);
        contactDescription.setBackground(new java.awt.Color(60, 60, 60));
        contactDescription.setColumns(20);
        contactDescription.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        contactDescription.setForeground(new java.awt.Color(172, 172, 172));
        contactDescription.setLineWrap(true);
        contactDescription.setRows(10);
        contactDescription.setText("This page allows you to contact either one of the programmers developing this app or a horticulturalist who has volunteered to help users. The contact pane allows you to contact the programmers for advice on the software or to report any bugs you are experiencing as well as horticulturalists for advice on planting or upkeep of your plants.");
        contactDescription.setWrapStyleWord(true);
        contactDescription.setBorder(null);
        contactDescription.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        contactDescription.setMinimumSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout homeTextLayout = new javax.swing.GroupLayout(homeText);
        homeText.setLayout(homeTextLayout);
        homeTextLayout.setHorizontalGroup(
            homeTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeTextLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(homeTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(settingsDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(introduction, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plantsDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(home, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(growth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(growthDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statistics, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plants, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(settings, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contactDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statisticsDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        homeTextLayout.setVerticalGroup(
            homeTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeTextLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(introduction, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47)
                .addComponent(homeDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(growth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(growthDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(statistics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56)
                .addComponent(statisticsDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(plants, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(plantsDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(contact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(contactDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(settings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(settingsDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addGap(88, 88, 88))
        );

        scrollText.setViewportView(homeText);

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcomePanel)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(scrollText, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE)
                .addContainerGap(220, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addComponent(welcomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollText, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE))
        );

        scrollText.getVerticalScrollBar().setValue(scrollText.getVerticalScrollBar().getMinimum());
        scrollText.getVerticalScrollBar().setUnitIncrement(20);

        displayArea.add(homePanel, "card2");

        statisticsPanel.setBackground(new java.awt.Color(60, 60, 60));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(172, 172, 172));
        jLabel4.setText("Statistics");

        temperatureButton.setBackground(new java.awt.Color(50, 50, 50));
        temperatureButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        temperatureButton.setForeground(new java.awt.Color(172, 172, 172));
        temperatureButton.setText("Temperature");
        temperatureButton.setToolTipText("");
        temperatureButton.setBorder(null);
        temperatureButton.setBorderPainted(false);
        temperatureButton.setContentAreaFilled(false);
        temperatureButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        temperatureButton.setFocusable(false);
        temperatureButton.setSelected(true);
        temperatureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temperatureButtonActionPerformed(evt);
            }
        });

        humidityButton.setBackground(new java.awt.Color(50, 50, 50));
        humidityButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        humidityButton.setForeground(new java.awt.Color(172, 172, 172));
        humidityButton.setText("Humidity");
        humidityButton.setToolTipText("");
        humidityButton.setBorder(null);
        humidityButton.setBorderPainted(false);
        humidityButton.setContentAreaFilled(false);
        humidityButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        humidityButton.setFocusable(false);
        humidityButton.setSelected(true);
        humidityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                humidityButtonActionPerformed(evt);
            }
        });

        lightButton.setBackground(new java.awt.Color(50, 50, 50));
        lightButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lightButton.setForeground(new java.awt.Color(172, 172, 172));
        lightButton.setText("Light");
        lightButton.setToolTipText("");
        lightButton.setBorder(null);
        lightButton.setBorderPainted(false);
        lightButton.setContentAreaFilled(false);
        lightButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lightButton.setFocusable(false);
        lightButton.setSelected(true);
        lightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lightButtonActionPerformed(evt);
            }
        });

        Moisture.setBackground(new java.awt.Color(50, 50, 50));
        Moisture.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Moisture.setForeground(new java.awt.Color(172, 172, 172));
        Moisture.setText("Moisture");
        Moisture.setToolTipText("");
        Moisture.setBorder(null);
        Moisture.setBorderPainted(false);
        Moisture.setContentAreaFilled(false);
        Moisture.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Moisture.setFocusable(false);
        Moisture.setSelected(true);
        Moisture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoistureActionPerformed(evt);
            }
        });

        panelCharts.setBackground(new java.awt.Color(51, 51, 51));
        panelCharts.setForeground(new java.awt.Color(0, 0, 0));
        panelCharts.setLayout(new java.awt.BorderLayout());
        panelCharts.add(hour.getChart(ChartGroup.TEMP),BorderLayout.CENTER);

        statisticsHelp.setBackground(new java.awt.Color(60, 60, 60));
        statisticsHelp.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        statisticsHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petrichor/pictures/help-circle-outline.png"))); // NOI18N
        statisticsHelp.setBorder(null);
        statisticsHelp.setContentAreaFilled(false);
        statisticsHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        statisticsHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statisticsHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout statisticsPanelLayout = new javax.swing.GroupLayout(statisticsPanel);
        statisticsPanel.setLayout(statisticsPanelLayout);
        statisticsPanelLayout.setHorizontalGroup(
            statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statisticsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(statisticsHelp)
                        .addContainerGap())
                    .addGroup(statisticsPanelLayout.createSequentialGroup()
                        .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(statisticsPanelLayout.createSequentialGroup()
                                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(temperatureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(humidityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Moisture, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statisticsPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(panelCharts, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE)
                        .addGap(285, 285, 285))))
        );
        statisticsPanelLayout.setVerticalGroup(
            statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statisticsHelp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCharts, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGroup(statisticsPanelLayout.createSequentialGroup()
                        .addComponent(temperatureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(humidityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(lightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(Moisture, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        displayArea.add(statisticsPanel, "card2");

        plantsPanel.setBackground(new java.awt.Color(60, 60, 60));

        plantsLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        plantsLabel.setForeground(new java.awt.Color(174, 174, 174));
        plantsLabel.setText("Plants");

        searchbarP.setBackground(new java.awt.Color(50, 50, 50));
        searchbarP.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        searchbarP.setForeground(new java.awt.Color(172, 172, 172));
        searchbarP.setText("Search...");
        searchbarP.setBorder(null);
        searchbarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchbarPMouseClicked(evt);
            }
        });
        searchbarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbarPActionPerformed(evt);
            }
        });

        clearTextButtonP.setBackground(new java.awt.Color(50, 50, 50));
        clearTextButtonP.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        clearTextButtonP.setForeground(new java.awt.Color(172, 172, 172));
        clearTextButtonP.setText("X ");
        clearTextButtonP.setBorder(null);
        clearTextButtonP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearTextButtonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearTextButtonPActionPerformed(evt);
            }
        });

        searchButtonP.setBackground(new java.awt.Color(60, 60, 60));
        searchButtonP.setForeground(new java.awt.Color(172, 172, 172));
        searchButtonP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petrichor/pictures/search.png"))); // NOI18N
        searchButtonP.setBorder(null);
        searchButtonP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButtonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonPActionPerformed(evt);
            }
        });

        plantsHelp.setBackground(new java.awt.Color(60, 60, 60));
        plantsHelp.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        plantsHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petrichor/pictures/help-circle-outline.png"))); // NOI18N
        plantsHelp.setBorder(null);
        plantsHelp.setContentAreaFilled(false);
        plantsHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plantsHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plantsHelpActionPerformed(evt);
            }
        });

        plantsScrollPane.setBackground(new java.awt.Color(50, 50, 50));
        plantsScrollPane.setBorder(null);
        plantsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        plantsScrollPane.setToolTipText("");

        gridPanel.setBackground(new java.awt.Color(50, 50, 50));
        gridPanel.setLayout(new java.awt.GridLayout(0, 1, 0, 10));

        testPanel.setBackground(new java.awt.Color(60, 60, 60));
        testPanel.setName(""); // NOI18N

        plantNameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        plantNameLabel.setForeground(new java.awt.Color(188, 188, 188));
        plantNameLabel.setText("Plant Name");

        latinNameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        latinNameLabel.setForeground(new java.awt.Color(188, 188, 188));
        latinNameLabel.setText("Latin Name");

        temperatureLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        temperatureLabel.setForeground(new java.awt.Color(188, 188, 188));
        temperatureLabel.setText("Temperature:");

        humidityLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        humidityLabel.setForeground(new java.awt.Color(188, 188, 188));
        humidityLabel.setText("Humidity:");

        lightLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lightLabel.setForeground(new java.awt.Color(188, 188, 188));
        lightLabel.setText("Light:");

        moistureLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        moistureLabel.setForeground(new java.awt.Color(188, 188, 188));
        moistureLabel.setText("Soil Moisture:");

        temperatureValueLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        temperatureValueLabel.setForeground(new java.awt.Color(188, 188, 188));
        temperatureValueLabel.setText("20");

        humidityValueLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        humidityValueLabel.setForeground(new java.awt.Color(188, 188, 188));
        humidityValueLabel.setText("50%");

        lightValueLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lightValueLabel.setForeground(new java.awt.Color(188, 188, 188));
        lightValueLabel.setText("50%");

        moistureValueLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        moistureValueLabel.setForeground(new java.awt.Color(188, 188, 188));
        moistureValueLabel.setText("10%");

        descriptionScrollPane.setBorder(null);
        descriptionScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        descriptionTextArea.setEditable(false);
        descriptionTextArea.setBackground(new java.awt.Color(60, 60, 60));
        descriptionTextArea.setColumns(20);
        descriptionTextArea.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descriptionTextArea.setForeground(new java.awt.Color(188, 188, 188));
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setRows(5);
        descriptionTextArea.setText("Description");
        descriptionTextArea.setBorder(null);
        descriptionScrollPane.setViewportView(descriptionTextArea);

        javax.swing.GroupLayout testPanelLayout = new javax.swing.GroupLayout(testPanel);
        testPanel.setLayout(testPanelLayout);
        testPanelLayout.setHorizontalGroup(
            testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(plantNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(latinNameLabel)
                .addGap(30, 30, 30))
            .addGroup(testPanelLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(temperatureValueLabel)
                    .addComponent(temperatureLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(humidityLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(humidityValueLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lightLabel)
                    .addComponent(lightValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(moistureLabel)
                    .addComponent(moistureValueLabel))
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, testPanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(descriptionScrollPane)
                .addGap(95, 95, 95))
        );
        testPanelLayout.setVerticalGroup(
            testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testPanelLayout.createSequentialGroup()
                .addContainerGap(582, Short.MAX_VALUE)
                .addGroup(testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plantNameLabel)
                    .addComponent(latinNameLabel))
                .addGap(29, 29, 29)
                .addGroup(testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temperatureLabel)
                    .addComponent(humidityLabel)
                    .addComponent(lightLabel)
                    .addComponent(moistureLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temperatureValueLabel)
                    .addComponent(humidityValueLabel)
                    .addComponent(lightValueLabel)
                    .addComponent(moistureValueLabel))
                .addGap(18, 18, 18)
                .addComponent(descriptionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridPanel.add(testPanel);

        plantsScrollPane.setViewportView(gridPanel);

        javax.swing.GroupLayout plantsPanelLayout = new javax.swing.GroupLayout(plantsPanel);
        plantsPanel.setLayout(plantsPanelLayout);
        plantsPanelLayout.setHorizontalGroup(
            plantsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plantsPanelLayout.createSequentialGroup()
                .addGroup(plantsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plantsPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(searchbarP, javax.swing.GroupLayout.DEFAULT_SIZE, 1490, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(clearTextButtonP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchButtonP)
                        .addGap(19, 19, 19))
                    .addGroup(plantsPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(plantsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(plantsHelp)
                .addContainerGap())
            .addGroup(plantsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(plantsPanelLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(plantsScrollPane)
                    .addGap(71, 71, 71)))
        );
        plantsPanelLayout.setVerticalGroup(
            plantsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plantsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plantsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plantsPanelLayout.createSequentialGroup()
                        .addComponent(plantsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(plantsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchButtonP)
                            .addComponent(searchbarP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearTextButtonP)))
                    .addComponent(plantsHelp))
                .addContainerGap(998, Short.MAX_VALUE))
            .addGroup(plantsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(plantsPanelLayout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addComponent(plantsScrollPane)
                    .addGap(126, 126, 126)))
        );

        plantsScrollPane.getVerticalScrollBar().setUnitIncrement(20);

        displayArea.add(plantsPanel, "card2");

        contactPanel.setBackground(new java.awt.Color(60, 60, 60));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(172, 172, 172));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Who would you like to contact?");

        horticulturalistsPanel.setBackground(new java.awt.Color(60, 60, 60));

        horticulturalists.setBackground(new java.awt.Color(60, 60, 60));
        horticulturalists.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        horticulturalists.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petrichor/pictures/sprout (4).png"))); // NOI18N
        horticulturalists.setToolTipText("");
        horticulturalists.setActionCommand("<html> Horticulturalists<br><br></html>");
        horticulturalists.setBorder(null);
        horticulturalists.setBorderPainted(false);
        horticulturalists.setContentAreaFilled(false);
        horticulturalists.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        horticulturalists.setDefaultCapable(false);
        horticulturalists.setFocusPainted(false);
        horticulturalists.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        horticulturalists.setRequestFocusEnabled(false);
        horticulturalists.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        horticulturalists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horticulturalistsActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(60, 60, 60));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(172, 172, 172));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Horticulturalists");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout horticulturalistsPanelLayout = new javax.swing.GroupLayout(horticulturalistsPanel);
        horticulturalistsPanel.setLayout(horticulturalistsPanelLayout);
        horticulturalistsPanelLayout.setHorizontalGroup(
            horticulturalistsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(horticulturalistsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(horticulturalistsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(horticulturalists, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE))
                .addContainerGap())
        );
        horticulturalistsPanelLayout.setVerticalGroup(
            horticulturalistsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(horticulturalistsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(horticulturalists, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
        );

        programmersPanel.setBackground(new java.awt.Color(60, 60, 60));
        programmersPanel.setToolTipText("");

        programmers.setBackground(new java.awt.Color(60, 60, 60));
        programmers.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        programmers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petrichor/pictures/data (1).png"))); // NOI18N
        programmers.setToolTipText("");
        programmers.setBorder(null);
        programmers.setBorderPainted(false);
        programmers.setContentAreaFilled(false);
        programmers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        programmers.setDefaultCapable(false);
        programmers.setFocusPainted(false);
        programmers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        programmers.setRequestFocusEnabled(false);
        programmers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programmersActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(187, 187, 187));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(172, 172, 172));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Programmers");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout programmersPanelLayout = new javax.swing.GroupLayout(programmersPanel);
        programmersPanel.setLayout(programmersPanelLayout);
        programmersPanelLayout.setHorizontalGroup(
            programmersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(programmersPanelLayout.createSequentialGroup()
                .addGroup(programmersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(programmersPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(programmers, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        programmersPanelLayout.setVerticalGroup(
            programmersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(programmersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(programmers, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        contactHelp.setBackground(new java.awt.Color(60, 60, 60));
        contactHelp.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        contactHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petrichor/pictures/help-circle-outline.png"))); // NOI18N
        contactHelp.setBorder(null);
        contactHelp.setContentAreaFilled(false);
        contactHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contactHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contactPanelLayout = new javax.swing.GroupLayout(contactPanel);
        contactPanel.setLayout(contactPanelLayout);
        contactPanelLayout.setHorizontalGroup(
            contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contactPanelLayout.createSequentialGroup()
                        .addComponent(programmersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42)
                        .addComponent(horticulturalistsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(4, 4, 4)
                .addComponent(contactHelp)
                .addContainerGap())
        );
        contactPanelLayout.setVerticalGroup(
            contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactHelp))
                .addGap(47, 47, 47)
                .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(horticulturalistsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contactPanelLayout.createSequentialGroup()
                        .addComponent(programmersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7)))
                .addGap(192, 192, 192))
        );

        displayArea.add(contactPanel, "card2");

        settingsPanel.setBackground(new java.awt.Color(60, 60, 60));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(172, 172, 172));
        jLabel7.setText("Settings");

        editCredentialButton.setBackground(new java.awt.Color(50, 50, 50));
        editCredentialButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        editCredentialButton.setForeground(new java.awt.Color(172, 172, 172));
        editCredentialButton.setText("<HTML><u>Edit my account's details</u></HTML>");
        editCredentialButton.setToolTipText("");
        editCredentialButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editCredentialButton.setContentAreaFilled(false);
        editCredentialButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editCredentialButton.setFocusable(false);
        editCredentialButton.setSelected(true);
        editCredentialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCredentialButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(editCredentialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1312, Short.MAX_VALUE))
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(62, 62, 62)
                .addComponent(editCredentialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(927, Short.MAX_VALUE))
        );

        displayArea.add(settingsPanel, "card2");

        javax.swing.GroupLayout informationPanelLayout = new javax.swing.GroupLayout(informationPanel);
        informationPanel.setLayout(informationPanelLayout);
        informationPanelLayout.setHorizontalGroup(
            informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1680, Short.MAX_VALUE)
        );
        informationPanelLayout.setVerticalGroup(
            informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        displayArea.add(informationPanel, "card9");

        mailingPanel.setBackground(new java.awt.Color(60, 60, 60));

        subjectField.setText(" Enter subject:");
        subjectField.setBorder(null);
        subjectField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        subjectField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subjectFieldMouseClicked(evt);
            }
        });
        subjectField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectFieldActionPerformed(evt);
            }
        });

        messageLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(188, 188, 188));
        messageLabel.setText("Message:");

        mailingPageLabel.setBackground(new java.awt.Color(60, 60, 60));
        mailingPageLabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        mailingPageLabel.setForeground(new java.awt.Color(188, 188, 188));
        mailingPageLabel.setText("Mailing");

        subjectLabel.setBackground(new java.awt.Color(60, 60, 60));
        subjectLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        subjectLabel.setForeground(new java.awt.Color(188, 188, 188));
        subjectLabel.setText("Subject:");

        messageField.setColumns(20);
        messageField.setRows(5);
        messageField.setText("Enter Message:");
        messageField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                messageFieldMouseClicked(evt);
            }
        });

        sendButton.setBackground(new java.awt.Color(60, 60, 60));
        sendButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        sendButton.setForeground(new java.awt.Color(188, 188, 188));
        sendButton.setText("Send");
        sendButton.setBorder(null);
        sendButton.setContentAreaFilled(false);
        sendButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(60, 60, 60));
        cancelButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(188, 188, 188));
        cancelButton.setText("Cancel");
        cancelButton.setBorder(null);
        cancelButton.setContentAreaFilled(false);
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        mailingHelp.setBackground(new java.awt.Color(60, 60, 60));
        mailingHelp.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        mailingHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petrichor/pictures/help-circle-outline.png"))); // NOI18N
        mailingHelp.setBorder(null);
        mailingHelp.setContentAreaFilled(false);
        mailingHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mailingHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailingHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mailingPanelLayout = new javax.swing.GroupLayout(mailingPanel);
        mailingPanel.setLayout(mailingPanelLayout);
        mailingPanelLayout.setHorizontalGroup(
            mailingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mailingPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(mailingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageField, javax.swing.GroupLayout.DEFAULT_SIZE, 1479, Short.MAX_VALUE)
                    .addGroup(mailingPanelLayout.createSequentialGroup()
                        .addComponent(subjectField, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                        .addGap(654, 654, 654))
                    .addGroup(mailingPanelLayout.createSequentialGroup()
                        .addGroup(mailingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subjectLabel)
                            .addComponent(messageLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(101, 101, 101))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mailingPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mailingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mailingPanelLayout.createSequentialGroup()
                        .addComponent(cancelButton)
                        .addGap(57, 57, 57)
                        .addComponent(sendButton)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mailingPanelLayout.createSequentialGroup()
                        .addComponent(mailingHelp)
                        .addContainerGap())))
            .addGroup(mailingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mailingPanelLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(mailingPageLabel)
                    .addContainerGap(1555, Short.MAX_VALUE)))
        );
        mailingPanelLayout.setVerticalGroup(
            mailingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mailingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mailingHelp)
                .addGap(57, 57, 57)
                .addComponent(subjectLabel)
                .addGap(18, 18, 18)
                .addComponent(subjectField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(messageLabel)
                .addGap(18, 18, 18)
                .addComponent(messageField, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addGroup(mailingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendButton)
                    .addComponent(cancelButton))
                .addGap(120, 120, 120))
            .addGroup(mailingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mailingPanelLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(mailingPageLabel)
                    .addContainerGap(1021, Short.MAX_VALUE)))
        );

        displayArea.add(mailingPanel, "card2");

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(displayArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Start of navigation bar buttons
//<editor-fold desc="Navigation Bar">
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        //remove the content currently displayed and refresh it
        displayArea.removeAll();
        displayArea.repaint();
        displayArea.revalidate();
        //add content and refresh it
        displayArea.add(homePanel);
        displayArea.repaint();
        displayArea.revalidate();
        resizeHomeScrollPanel();

    }//GEN-LAST:event_homeButtonActionPerformed

    private void statisticsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statisticsButtonActionPerformed
        //remove the content currently displayed and refresh it
        displayArea.removeAll();
        displayArea.repaint();
        displayArea.revalidate();
        //add content and refresh it
        displayArea.add(statisticsPanel);
        displayArea.repaint();
        displayArea.revalidate();
    }//GEN-LAST:event_statisticsButtonActionPerformed

    private void growthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_growthButtonActionPerformed
        //remove the content currently displayed and refresh it
        currentlyGrowth = true;
        displayArea.removeAll();
        displayArea.repaint();
        displayArea.revalidate();
        //add content and refresh it
        displayArea.add(plantsPanel);
        displayArea.repaint();
        displayArea.revalidate();
        plantsLabel.setText("My Plants");
        gridPanel.removeAll();
        String input = allPlants.getUserPlantInformation();
        if (!input.equals("")) {
            String[] split = input.split("\n");
            for (int i = 0; i < split.length; i++) {
                gridPanel.add(PlantPanel.createPanel(split[i], true, allPlants));
            }
        } else {
            gridPanel.add(new JLabel("You aren't currently growing any plants"));
        }
        gridPanel.repaint();
        gridPanel.revalidate();
    }//GEN-LAST:event_growthButtonActionPerformed

    private void plantsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plantsButtonActionPerformed
        //remove the content currently displayed and refresh it
        currentlyGrowth = false;

        displayArea.removeAll();
        displayArea.repaint();
        displayArea.revalidate();
        //add content and refresh it
        displayArea.add(plantsPanel);
        displayArea.repaint();
        displayArea.revalidate();
        plantsLabel.setText("All Plants");
        gridPanel.removeAll();
        String input = allPlants.getAllPlantInformation();
        String[] split = input.split("\n");
        for (int i = 0; i < split.length; i++) {
            gridPanel.add(PlantPanel.createPanel(split[i], false, allPlants));
        }
        gridPanel.repaint();
        gridPanel.revalidate();
    }//GEN-LAST:event_plantsButtonActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        //remove the content currently displayed and refresh it
        displayArea.removeAll();
        displayArea.repaint();
        displayArea.revalidate();
        //add content and refresh it
        displayArea.add(settingsPanel);
        displayArea.repaint();
        displayArea.revalidate();
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void contactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactButtonActionPerformed
        //remove the content currently displayed and refresh it
        displayArea.removeAll();
        displayArea.repaint();
        displayArea.revalidate();
        //add content and refresh it
        displayArea.add(contactPanel);
        displayArea.repaint();
        displayArea.revalidate();
    }//GEN-LAST:event_contactButtonActionPerformed
//</editor-fold>
    //End of navigation bar buttons
    // Statistics page buttons
    private void temperatureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temperatureButtonActionPerformed
        panelCharts.removeAll();
        panelCharts.add(hour.getChart(ChartGroup.TEMP), BorderLayout.CENTER);
        panelCharts.repaint();
        panelCharts.revalidate();
    }//GEN-LAST:event_temperatureButtonActionPerformed

    private void lightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lightButtonActionPerformed
        panelCharts.removeAll();
        panelCharts.add(hour.getChart(ChartGroup.LIGHT), BorderLayout.CENTER);
        panelCharts.repaint();
        panelCharts.revalidate();
    }//GEN-LAST:event_lightButtonActionPerformed

    private void MoistureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoistureActionPerformed
        panelCharts.removeAll();
        panelCharts.add(hour.getChart(ChartGroup.MOISTURE), BorderLayout.CENTER);
        panelCharts.repaint();
        panelCharts.revalidate();
    }//GEN-LAST:event_MoistureActionPerformed

    private void humidityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_humidityButtonActionPerformed
        panelCharts.removeAll();
        panelCharts.add(hour.getChart(ChartGroup.HUMIDITY), BorderLayout.CENTER);
        panelCharts.repaint();
        panelCharts.revalidate();
    }//GEN-LAST:event_humidityButtonActionPerformed

    private void programmersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programmersActionPerformed
        contactWho = 'p';
        //remove the content currently displayed and refresh it
        displayArea.removeAll();
        displayArea.repaint();
        displayArea.revalidate();
        //add content and refresh it
        displayArea.add(mailingPanel);
        displayArea.repaint();
        displayArea.revalidate();
        subjectField.setText(" Enter subject:");
        messageField.setText("Enter Message:");
    }//GEN-LAST:event_programmersActionPerformed

    private void horticulturalistsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horticulturalistsActionPerformed
        contactWho = 'h';
        //remove the content currently displayed and refresh it
        displayArea.removeAll();
        displayArea.repaint();
        displayArea.revalidate();
        //add content and refresh it
        displayArea.add(mailingPanel);
        displayArea.repaint();
        displayArea.revalidate();
    }//GEN-LAST:event_horticulturalistsActionPerformed

    private void searchbarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbarPActionPerformed

    }//GEN-LAST:event_searchbarPActionPerformed

    private void clearTextButtonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearTextButtonPActionPerformed
        searchbarP.setText("");
    }//GEN-LAST:event_clearTextButtonPActionPerformed

    private void searchButtonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonPActionPerformed
        if (searchbarP.getText().contains("'")) {
            JOptionPane.showMessageDialog(null, "Please ensure your search does not include the ' character");
            return;
        }
        if (!currentlyGrowth) {
            gridPanel.removeAll();
            String input = AllPlants.getSearchInformation(searchbarP.getText());
            if (!input.equals("")) {
                String[] split = input.split("\n");
                for (int i = 0; i < split.length; i++) {
                    gridPanel.add(PlantPanel.createPanel(split[i], false, allPlants));
                }
            } else {
                gridPanel.add(new JLabel("No plants matched your search query"));
            }
            gridPanel.repaint();
            gridPanel.revalidate();
        } else {
            gridPanel.removeAll();
            String input = allPlants.getUserSearchInformation(searchbarP.getText());
            if (!input.equals("")) {
                String[] split = input.split("\n");
                for (int i = 0; i < split.length; i++) {
                    gridPanel.add(PlantPanel.createPanel(split[i], true, allPlants));
                }
            } else {
                gridPanel.add(new JLabel("No plants matched your search query"));
            }
            gridPanel.repaint();
            gridPanel.revalidate();
        }
    }//GEN-LAST:event_searchButtonPActionPerformed

    private void searchbarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbarPMouseClicked
        if (searchbarP.getText().equals("Search...")) {
            searchbarP.setText("");
        }
    }//GEN-LAST:event_searchbarPMouseClicked

    private void subjectFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectFieldActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        displayArea.removeAll();
        displayArea.repaint();
        displayArea.revalidate();
        //add content and refresh it
        displayArea.add(contactPanel);
        displayArea.repaint();
        displayArea.revalidate();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void subjectFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjectFieldMouseClicked
        if (subjectField.getText().equalsIgnoreCase(" Enter subject:")) {
            subjectField.setText("");
        }
    }//GEN-LAST:event_subjectFieldMouseClicked

    private void messageFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messageFieldMouseClicked
        if (messageField.getText().equalsIgnoreCase("Enter Message:")) {
            messageField.setText("");
        }
    }//GEN-LAST:event_messageFieldMouseClicked

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        Emailing.sendEmail(subjectField.getText(), messageField.getText(), (contactWho == 'p' ? Emailing.PROGRAMMERS : Emailing.HORTICULTURALISTS), currentUser.getEmail());
        displayArea.removeAll();
        displayArea.repaint();
        displayArea.revalidate();
        //add content and refresh it
        displayArea.add(contactPanel);
        displayArea.repaint();
        displayArea.revalidate();
    }//GEN-LAST:event_sendButtonActionPerformed

    private void mailingHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailingHelpActionPerformed
        JOptionPane.showMessageDialog(null, GettingHelp.getHelp("mailing"));
    }//GEN-LAST:event_mailingHelpActionPerformed

    private void contactHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactHelpActionPerformed
        JOptionPane.showMessageDialog(null, GettingHelp.getHelp("contact"));
    }//GEN-LAST:event_contactHelpActionPerformed

    private void plantsHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plantsHelpActionPerformed
        if (currentlyGrowth) {
            JOptionPane.showMessageDialog(null, GettingHelp.getHelp("growth"));
        } else {
            JOptionPane.showMessageDialog(null, GettingHelp.getHelp("plants"));
        }
    }//GEN-LAST:event_plantsHelpActionPerformed

    private void statisticsHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statisticsHelpActionPerformed
        JOptionPane.showMessageDialog(null, GettingHelp.getHelp("statistics"));
    }//GEN-LAST:event_statisticsHelpActionPerformed

    private void homeHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeHelpActionPerformed
        JOptionPane.showMessageDialog(null, GettingHelp.getHelp("home"));
    }//GEN-LAST:event_homeHelpActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        if (displayArea.getComponent(0) == homePanel) {
            resizeHomeScrollPanel();
        }
        if (displayArea.getComponent(0) == plantsPanel) {
            plantsScrollPane.setSize((int) Math.round((displayArea.getWidth() * 1.0 / 1.077613855035279)), plantsScrollPane.getHeight());
            gridPanel.setSize((int) Math.round((displayArea.getWidth() * 1.0 / 1.077613855035279)), gridPanel.getHeight());
        }
    }//GEN-LAST:event_formComponentResized

    private void editCredentialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCredentialButtonActionPerformed
        NewUser editing = new NewUser(currentUser);
        editing.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editCredentialButtonActionPerformed

    private void resizeHomeScrollPanel() {
        double width = (int) Math.round((this.getBounds().getWidth() - 120.0) / 1.1);
        scrollText.setSize((int) Math.round(width / 1.25), scrollText.getHeight());
        homeText.setSize((int) Math.round(width / 1.25), homeText.getHeight());
        introduction.setSize(WIDTH, introduction.getHeight());
        plantsDescription.setSize(WIDTH, plantsDescription.getHeight());
        contact.setSize(WIDTH, contact.getHeight());
        home.setSize(WIDTH, home.getHeight());
        homeDescription.setSize(WIDTH, homeDescription.getHeight());
        growth.setSize(WIDTH, growth.getHeight());
        growthDescription.setSize(WIDTH, growthDescription.getHeight());
        statistics.setSize(WIDTH, statistics.getHeight());
        statisticsDescription.setSize(WIDTH, statisticsDescription.getHeight());
        plants.setSize(WIDTH, plants.getHeight());
        settingsDescription.setSize(WIDTH, settingsDescription.getHeight());
        settings.setSize(WIDTH, settings.getHeight());
        contactDescription.setSize(WIDTH, contactDescription.getHeight());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Moisture;
    private javax.swing.JPanel basePanel;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton clearTextButtonP;
    private javax.swing.JLabel contact;
    private javax.swing.JButton contactButton;
    private javax.swing.JTextArea contactDescription;
    private javax.swing.JButton contactHelp;
    private javax.swing.JPanel contactPanel;
    private javax.swing.JScrollPane descriptionScrollPane;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JPanel displayArea;
    private javax.swing.JButton editCredentialButton;
    private javax.swing.JPanel gridPanel;
    private javax.swing.JLabel growth;
    private javax.swing.JButton growthButton;
    private javax.swing.JTextArea growthDescription;
    private javax.swing.JLabel home;
    private javax.swing.JButton homeButton;
    private javax.swing.JTextArea homeDescription;
    private javax.swing.JButton homeHelp;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel homeText;
    private javax.swing.JButton horticulturalists;
    private javax.swing.JPanel horticulturalistsPanel;
    private javax.swing.JButton humidityButton;
    private javax.swing.JLabel humidityLabel;
    private javax.swing.JLabel humidityValueLabel;
    private javax.swing.JPanel informationPanel;
    private javax.swing.JTextArea introduction;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel latinNameLabel;
    private javax.swing.JButton lightButton;
    private javax.swing.JLabel lightLabel;
    private javax.swing.JLabel lightValueLabel;
    private javax.swing.JButton mailingHelp;
    private javax.swing.JLabel mailingPageLabel;
    private javax.swing.JPanel mailingPanel;
    private javax.swing.JTextArea messageField;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel moistureLabel;
    private javax.swing.JLabel moistureValueLabel;
    private javax.swing.JPanel panelCharts;
    private javax.swing.JLabel plantNameLabel;
    private javax.swing.JLabel plants;
    private javax.swing.JButton plantsButton;
    private javax.swing.JTextArea plantsDescription;
    private javax.swing.JButton plantsHelp;
    private javax.swing.JLabel plantsLabel;
    private javax.swing.JPanel plantsPanel;
    private javax.swing.JScrollPane plantsScrollPane;
    private javax.swing.JButton programmers;
    private javax.swing.JPanel programmersPanel;
    private javax.swing.JScrollPane scrollText;
    private javax.swing.JButton searchButtonP;
    private javax.swing.JTextField searchbarP;
    private javax.swing.JButton sendButton;
    private javax.swing.JLabel settings;
    private javax.swing.JButton settingsButton;
    private javax.swing.JTextArea settingsDescription;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JLabel statistics;
    private javax.swing.JButton statisticsButton;
    private javax.swing.JTextArea statisticsDescription;
    private javax.swing.JButton statisticsHelp;
    private javax.swing.JPanel statisticsPanel;
    private javax.swing.JTextField subjectField;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JButton temperatureButton;
    private javax.swing.JLabel temperatureLabel;
    private javax.swing.JLabel temperatureValueLabel;
    private javax.swing.JPanel testPanel;
    private javax.swing.JLayeredPane welcomePanel;
    // End of variables declaration//GEN-END:variables
}
