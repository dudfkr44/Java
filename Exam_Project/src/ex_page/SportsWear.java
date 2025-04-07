package ex_page;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SportsWear {

	static User user;
	static User_load_writer_save save;

	public SportsWear(User user) {
		this.user = user;
	}

	public void main() {
		JFrame frame = new JFrame("Sportswear");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(1200, 900);

		// 상단에 "Your Protein" 라벨 추가
		JLabel titleLabel = new JLabel("Your Protein", SwingConstants.LEFT);
		titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
		titleLabel.setPreferredSize(new Dimension(200, 50));
		titleLabel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0)); // 왼쪽 여백 추가

		JPanel mainPanel = createMainPanel();
		JScrollPane scrollPane = new JScrollPane(mainPanel);

		// 프레임에 라벨과 스크롤 패널 추가
		frame.setLayout(new BorderLayout());
		frame.add(titleLabel, BorderLayout.NORTH);
		frame.add(scrollPane, BorderLayout.CENTER);

		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

	private static JPanel createMainPanel() {
		JPanel mainPanel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH; // 가로/세로 채우기
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(20, 20, 20, 20); // 상하좌우 여백 20씩 조정

		String[][] products = { { "T-shirt", "1.jpg", "$20", "Comfortable and stylish.", "0", "4.5", "M", "10" },
				{ "Shorts", "2.jpg", "$25", "Perfect for summer.", "10", "4.0", "L", "5" },
				{ "Socks", "3.jpg", "$10", "Soft and breathable.", "0", "4.8", "S", "20" },
				{ "Compression Shirt", "4.jpg", "$30", "High-performance shirt.", "0", "4.2", "M", "15" },
				{ "Muscle Shirt", "5.jpg", "$35", "Stylish muscle shirt.", "15", "4.3", "L", "7" },
				{ "Jacket", "6.jpg", "$50", "Weather-resistant jacket.", "20", "4.7", "XL", "3" } };

		int row = 0, col = 0;
		for (String[] product : products) {
			gbc.gridx = col;
			gbc.gridy = row;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			mainPanel.add(createProductPanel(product), gbc);
			col++;
			if (col == 3) { // 3열마다 행 증가
				col = 0;
				row++;
			}
		}
		return mainPanel;
	}

	private static JPanel createProductPanel(String[] product) {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(250, 400)); // 고정 크기

		JLabel productLabel = new JLabel(product[0], SwingConstants.CENTER);
		productLabel.setFont(new Font("Arial", Font.BOLD, 20));
		productLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

		// 이미지 로딩 및 스케일링
		ImageIcon productIcon = new ImageIcon("image/" + product[1]);
		Image scaledImage = productIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		JLabel productImage = new JLabel(new ImageIcon(scaledImage));
		productImage.setAlignmentX(Component.CENTER_ALIGNMENT);

		JLabel productPrice = new JLabel(product[2], SwingConstants.CENTER);
		productPrice.setFont(new Font("Arial", Font.PLAIN, 18));
		productPrice.setAlignmentX(Component.CENTER_ALIGNMENT);
		if (!product[4].equals("0")) {
			productPrice.setForeground(Color.RED);
		}

		JLabel productDescription = new JLabel(product[3], SwingConstants.CENTER);
		productDescription.setFont(new Font("Arial", Font.ITALIC, 16));
		productDescription.setAlignmentX(Component.CENTER_ALIGNMENT);

		// 별점 라벨
		JLabel ratingLabel = new JLabel("Rating: " + product[5], SwingConstants.CENTER);
		ratingLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		ratingLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

		JButton buyButton = new JButton("Buy Now");
		buyButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		buyButton.setPreferredSize(new Dimension(120, 40));
		buyButton.setMaximumSize(new Dimension(120, 40));
		buyButton.setBackground(new Color(0, 123, 255));
		buyButton.setForeground(Color.WHITE);
		buyButton.setFocusPainted(false);
		buyButton.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
		buyButton.setFont(new Font("Arial", Font.BOLD, 16));

		// 버튼 마우스 이벤트
		buyButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				buyButton.setBackground(Color.DARK_GRAY);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				buyButton.setBackground(new Color(0, 123, 255));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				openPaymentDialog(product[0], product[2], product[6], product[7]);
			}
		}); // 사용자가 "Buy Now" 버튼을 클릭하면, openPaymentDialog 메서드를 호출하여 결제 관련 정보를 전달

		// 패널 마우스 오버 효과
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setBackground(new Color(220, 220, 255));
				panel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBackground(Color.WHITE);
				panel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
			}
		});

		// 컴포넌트 추가
		panel.add(productLabel);
		panel.add(Box.createRigidArea(new Dimension(0, 5)));
		panel.add(productImage);
		panel.add(Box.createRigidArea(new Dimension(0, 5)));
		panel.add(productPrice);
		panel.add(Box.createRigidArea(new Dimension(0, 5)));
		panel.add(productDescription);
		panel.add(Box.createRigidArea(new Dimension(0, 5)));
		panel.add(ratingLabel);

		// 세일 라벨 추가
		if (!product[4].equals("0")) {
			JLabel saleLabel = new JLabel("ON SALE - " + product[4] + "% OFF", SwingConstants.CENTER);
			saleLabel.setFont(new Font("Arial", Font.BOLD, 16));
			saleLabel.setForeground(Color.RED);
			saleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
			panel.add(saleLabel);
		}

		// 버튼 아래 여백 추가
		panel.add(Box.createVerticalGlue());
		panel.add(buyButton);
		panel.add(Box.createRigidArea(new Dimension(0, 10)));

		return panel;
	}

	public static void openPaymentDialog(String productName, String productPrice, String size, String stock) {
		JDialog paymentDialog = new JDialog();
		paymentDialog.setTitle("Payment");
		paymentDialog.setSize(500, 450);
		paymentDialog.setLocationRelativeTo(null);
		paymentDialog.setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.anchor = GridBagConstraints.LINE_START;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1.0;

		// 상품명 표시
		gbc.gridx = 0;
		gbc.gridy = 0;
		paymentDialog.add(new JLabel("🛍 Product: " + productName), gbc);

		// 가격 표시 (오른쪽 정렬)
		gbc.gridx = 1;
		JLabel priceLabel = new JLabel("Price: " + productPrice);
		priceLabel.setForeground(new Color(0, 150, 0));
		priceLabel.setFont(new Font("Arial", Font.BOLD, 14));
		gbc.anchor = GridBagConstraints.LINE_END;
		paymentDialog.add(priceLabel, gbc);
		gbc.anchor = GridBagConstraints.LINE_START;

		// 사이즈 선택
		gbc.gridx = 0;
		gbc.gridy = 1;
		paymentDialog.add(new JLabel("📏 Available Size:"), gbc);

		gbc.gridx = 1;
		String[] sizes = { "S", "M", "L", "XL" };
		JComboBox<String> sizeComboBox = new JComboBox<>(sizes);
		paymentDialog.add(sizeComboBox, gbc);

		// 재고 표시
		gbc.gridx = 0;
		gbc.gridy = 2;
		paymentDialog.add(new JLabel("📦 Stock: " + stock), gbc);

		// 수량 조절
		gbc.gridx = 0;
		gbc.gridy = 3;
		paymentDialog.add(new JLabel("🛒 Quantity:"), gbc);

		JPanel quantityPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton minusButton = new JButton("➖");
		JLabel quantityLabel = new JLabel("1", SwingConstants.CENTER);
		JButton plusButton = new JButton("➕");

		minusButton.setPreferredSize(new Dimension(50, 35));
		plusButton.setPreferredSize(new Dimension(50, 35));
		quantityLabel.setPreferredSize(new Dimension(50, 35));
		quantityLabel.setFont(new Font("Arial", Font.BOLD, 16));
		quantityLabel.setHorizontalAlignment(SwingConstants.CENTER);

		minusButton.setBackground(Color.LIGHT_GRAY);
		plusButton.setBackground(Color.LIGHT_GRAY);
		minusButton.setFocusPainted(false);
		plusButton.setFocusPainted(false);

		int maxStock = Integer.parseInt(stock);
		int[] quantity = { 1 };

		minusButton.addActionListener(e -> {
			if (quantity[0] > 1) {
				quantity[0]--;
				quantityLabel.setText(String.valueOf(quantity[0]));
			}
		});

		plusButton.addActionListener(e -> {
			if (quantity[0] < maxStock) {
				quantity[0]++;
				quantityLabel.setText(String.valueOf(quantity[0]));
			}
		});

		quantityPanel.add(minusButton);
		quantityPanel.add(quantityLabel);
		quantityPanel.add(plusButton);

		gbc.gridx = 1;
		paymentDialog.add(quantityPanel, gbc);

		// 사용자 입력 필드
		gbc.gridx = 0;
		gbc.gridy = 4;
		paymentDialog.add(new JLabel("👤 Name:"), gbc);
		JTextField nameField = new JTextField();
		styleTextField(nameField);
		gbc.gridx = 1;
		paymentDialog.add(nameField, gbc);

		gbc.gridx = 0;
		gbc.gridy = 5;
		paymentDialog.add(new JLabel("💳 Card Number:"), gbc);
		JTextField cardField = new JTextField();
		styleTextField(cardField);
		gbc.gridx = 1;
		paymentDialog.add(cardField, gbc);

		gbc.gridx = 0;
		gbc.gridy = 6;
		paymentDialog.add(new JLabel("📅 Expiry Date (MM/YY):"), gbc);
		JTextField expiryField = new JTextField();
		styleTextField(expiryField);
		gbc.gridx = 1;
		paymentDialog.add(expiryField, gbc);

		// 결제 버튼
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.gridwidth = GridBagConstraints.REMAINDER; // 나머지 열 차지
		JButton payButton = new JButton("Pay Now");
		payButton.setPreferredSize(new Dimension(200, 40));
		payButton.setBackground(new Color(0, 123, 255));
		payButton.setForeground(Color.WHITE);
		payButton.setFont(new Font("Arial", Font.BOLD, 16));
		payButton.setBorder(BorderFactory.createLineBorder(new Color(0, 100, 255), 2));
		payButton.setFocusPainted(false);

		// 버튼 호버 효과
		payButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				payButton.setBackground(new Color(0, 80, 200));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				payButton.setBackground(new Color(0, 123, 255));
			}
		});

		payButton.addActionListener(e -> {
			String selectedSize = (String) sizeComboBox.getSelectedItem();
			JOptionPane.showMessageDialog(paymentDialog,
					"✅ Payment Successful!\n" + "📏 Size: " + selectedSize + "\n" + "🛒 Quantity: " + quantity[0],
					"Success", JOptionPane.INFORMATION_MESSAGE);
			user.setMoney(user.getMoney() - 36689);
			paymentDialog.dispose();
		});

		paymentDialog.add(payButton, gbc);

		paymentDialog.setVisible(true);
	}

	// 텍스트 필드 스타일링 메서드
	private static void styleTextField(JTextField textField) {
		textField.setFont(new Font("Arial", Font.PLAIN, 14));
		textField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		textField.setBackground(new Color(240, 240, 240));
	}
}