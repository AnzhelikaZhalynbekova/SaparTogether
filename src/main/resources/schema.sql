CREATE TABLE Trip (
                      trip_id INT PRIMARY KEY AUTO_INCREMENT,
                      name VARCHAR(255) NOT NULL,
                      location VARCHAR(255) NOT NULL,
                      start_date DATE NOT NULL,
                      end_date DATE NOT NULL,
                      budget INT NOT NULL,
                      peoplenum INT NOT NULL,
                      description TEXT,
                      link VARCHAR(255)
);
INSERT INTO Trip (name, location, start_date, end_date, budget, peoplenum, description, link) VALUES
      ('Mountains Escape', 'Bishkek', '2025-06-01', '2025-06-07', 500, 4, 'Enjoy a week in the Kyrgyz mountains.', 'https://chat.group/mountains'),
      ('Paris Adventure', 'Paris', '2025-07-10', '2025-07-20', 1500, 2, 'Explore the streets of Paris with a travel buddy.', 'https://chat.group/paris'),
      ('Island Retreat', 'Maldives', '2025-08-15', '2025-08-22', 2500, 3, 'Relax on the beaches and enjoy island life.', 'https://chat.group/maldives'),
      ('City Lights Tour', 'New York', '2025-09-01', '2025-09-10', 1800, 5, 'Experience the best of NYC nightlife and attractions.', 'https://chat.group/nyc'),
      ('Desert Camping', 'Dubai', '2025-10-05', '2025-10-12', 900, 6, 'Spend a week camping in the Arabian desert.', 'https://chat.group/dubai');
