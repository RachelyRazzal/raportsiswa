-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 01 Jul 2020 pada 18.22
-- Versi server: 10.3.15-MariaDB
-- Versi PHP: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `raport`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `uname` varchar(30) NOT NULL,
  `pass` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`uname`, `pass`) VALUES
('adminsatu', 'kelassatu'),
('admindua', 'kelasdua'),
('admintiga', 'kelastiga'),
('adminempat', 'kelasempat'),
('adminlima', 'kelaslima'),
('adminenam', 'kelasenam');

-- --------------------------------------------------------

--
-- Struktur dari tabel `guru`
--

CREATE TABLE `guru` (
  `id` varchar(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(300) NOT NULL,
  `nohp` varchar(12) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `guru`
--

INSERT INTO `guru` (`id`, `nama`, `alamat`, `nohp`, `email`) VALUES
('G001', 'Siswanto, S.Pd', 'Jln. Sumurwangi RT 02/03 Sidamukti, Depok', '085694861928', 'siswanto@gmail.com'),
('G002', 'Novin Dinihari, S.Pd', 'Perum Taman Anyelir 3B Blok K2 No.18, Jakarta', '089604388817', 'novindinihari@gmail.com'),
('G003', 'Dra. Hj. Desmiarlen', 'Pekapuran Gg. Belong RT 02/03 No.31, Depok', '085718013240', 'desmiarlen@gmail.com'),
('G004', 'Retno Wulandari, S.Pd', 'Jln. Kapitan 3, Pekapuran, Depok', '083890321340', 'retnowulandari@gmail.com'),
('G005', 'Dra. Rachmisari', 'Jln. Cempaka 7 No. 74, Jatijajar, Depok', '089666924330', 'rachmisari@gmail.com'),
('G006', 'Kundarti, S.Pd', 'Jln. Sugutamu RT 07/21 No. 31, Depok', '089791180621', 'kundarti@gmail.com'),
('G007', 'Nazaruddin, S.Pd', 'Jln. Bali No. 36, Depok', '085778803228', 'nazaruddin@gmail.com'),
('G008', 'Lis Mulisoh, SS', 'Jln. Lematang I No. 130 Rt 06/04, Depok', '081986122232', 'lismulisoh@gmail.com'),
('G009', 'Neli Isnaeni, S.Pd', 'Jln. Kenanga Rt 01/19 No. 18', '089636605533', 'neliisnaeni@gmail.com');

-- --------------------------------------------------------

--
-- Struktur dari tabel `murid`
--

CREATE TABLE `murid` (
  `noinduk` varchar(30) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `nisn` varchar(30) NOT NULL,
  `ttl` varchar(200) NOT NULL,
  `agama` varchar(10) NOT NULL,
  `jk` varchar(10) NOT NULL,
  `pendidikan` varchar(20) NOT NULL,
  `alamatmurid` varchar(300) NOT NULL,
  `ekstrakulikuler` varchar(50) NOT NULL,
  `hobi` varchar(50) NOT NULL,
  `namaayah` varchar(300) NOT NULL,
  `pekerjaanayah` varchar(50) NOT NULL,
  `namaibu` varchar(300) NOT NULL,
  `pekerjaanibu` varchar(50) NOT NULL,
  `nohportu` varchar(20) NOT NULL,
  `alamatortu` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `murid`
--

INSERT INTO `murid` (`noinduk`, `nama`, `nisn`, `ttl`, `agama`, `jk`, `pendidikan`, `alamatmurid`, `ekstrakulikuler`, `hobi`, `namaayah`, `pekerjaanayah`, `namaibu`, `pekerjaanibu`, `nohportu`, `alamatortu`) VALUES
('14.15.001', 'Anissa Putri', '00890601', 'Jakarta, 24 Desember 2007', 'Islam', 'Perempuan', 'Taman Kanak-Kanak', 'Jln.Cilayu RT 02/03 No 30, Cisalak Pasar', 'Pramuka', 'Membaca', 'Dimas Prayogo', 'Karyawan Swasta', 'Addini Daulati', 'Ibu Rumah Tangga', '089782668809', 'Jln Cilayu RT 02/03 No 30, Cisalak Pasar'),
('14.15.002', 'Amadea Fahdinda', '00890602', 'Depok, 8 April 2007', 'Protestan', 'Perempuan', 'PAUD', 'Perum Mekarperdana Blok V No 11', 'Marching Band', 'Mewarnai', 'Wahyudi', 'Pelukis', 'Farhana', 'Seniman', '08881114090', 'Perum Mekarperdana Blok V No 11'),
('14.15.003', 'Conita Fitriani', '00890603', 'Depok,2 Februari 2007', 'Islam', 'Perempuan', 'Taman Belajar', 'Jln Merdeka Raya Rt 04/28', 'Marching Band', 'Menggambar', 'Kurniawan Ramadhan', 'Polisi', 'Inayah Nabila', 'Perawat', '08978256747', 'Jln Merdeka Raya Rt 04/28'),
('14.15.004', 'Gilang Putra', '00890604', 'Depok, 4 Februari 2007', 'Katolik', 'Laki-laki', 'Taman Kanak-Kanak', 'Pondok Sukatani Permai Blok AA No 20', 'Futsal', 'Main bola', 'Indra Putra', 'Seniman', 'Jihan Ayu', 'Seniman', '08999641442', 'Pondok Sukatani Permai Blok AA No 20'),
('14.15.005', 'Mayanda Hilda', '00890605', 'Jakarta, 8 Mei 2007', 'Islam', 'Perempuan', 'Taman Kanak-Kanak', 'Kp Cilangkap Rt 01/17 No 96', 'Paskibra', 'Berenang', 'Muhammad Ibnu', 'Tentara Nasional Indonesia', 'Nur Indah', 'Dokter', '08788365863', 'Kp Cilangkap Rt 01/17 No 96'),
('14.15.006', 'Mia Anggrainy', '00890606', 'Jakarta, 28 September 2007', 'Islam', 'Perempuan', 'Taman Kanak-Kanak', 'Jln Anger No 120', 'Paskibra', 'Menulis', 'Nur Kholis', 'Programmer', 'Nilla Wulandari', 'Ibu Rumah Tangga', '085697369451', 'Jln Anger No 120'),
('14.15.007', 'Pandu Jayalaksono', '00890607', 'Depok, 6 Juli 2007', 'Hindu', 'Laki-laki', 'Taman Kanak-Kanak', 'Jln Laut Banda Blok A No 6', 'Futsal', 'Berenang', 'Prakoso Dwi', 'Pemain Band', 'Renita Agustin', 'Penyanyi', '085715469983', 'Jln Laut Banda Blok A No 6'),
('14.15.008', 'Roy Yoga', '00890608', 'Depok, 5 Oktober 2007', 'Konghucu', 'Laki-laki', 'Taman Belajar', 'Jatijajar II Rt 01.07 No 89', 'Paskibra', 'Menggambar', 'Ravendra Putra', 'Karyawan Swasta', 'Septianti', 'Karyawan Swasta', '081315588115', 'Jatijajar II Rt 01.07 No 89'),
('14.15.009', 'Reza Fathur Rahman', '00890609', 'Jakarta, 13 Januari 2008', 'Islam', 'Laki-laki', 'Taman Belajar', 'Jln Mahakam IV RT 01/12 No 48', 'Futsal', 'Menyanyi', 'Raka Pramana', 'Karyawan Swasta', 'Nur Idha', 'Wiraswasta', '085697369431', 'Jln Mahakam IV RT 01/12 No 48'),
('14.15.010', 'Rifki Rachmat Ramadhan', '00890810', 'Jakarta, 28bOktober 2007', 'Islam', 'Laki-laki', 'Taman Kanak-Kanak', 'Jln Raya Bogor KM 29 Rt 02/01 No 18', 'Futsal', 'Menulis', 'Ringgo Ilham', 'Seniman', 'Zaenab Aray', 'Penyanyi', '08567882676', 'Jln Raya Bogor KM 29 Rt 02/01 No 18');

-- --------------------------------------------------------

--
-- Struktur dari tabel `uas`
--

CREATE TABLE `uas` (
  `id_murid` varchar(20) NOT NULL,
  `nama_murid` varchar(200) NOT NULL,
  `kelas_ajaran` varchar(30) NOT NULL,
  `semester` varchar(6) NOT NULL,
  `id_guru` varchar(20) NOT NULL,
  `nama_guru` varchar(200) NOT NULL,
  `p_agama` int(3) NOT NULL,
  `k_agama` int(3) NOT NULL,
  `p_pkn` int(3) NOT NULL,
  `k_pkn` int(3) NOT NULL,
  `p_indo` int(3) NOT NULL,
  `k_indo` int(3) NOT NULL,
  `p_mtk` int(3) NOT NULL,
  `k_mtk` int(3) NOT NULL,
  `p_ipa` int(3) NOT NULL,
  `k_ipa` int(3) NOT NULL,
  `p_ips` int(3) NOT NULL,
  `k_ips` int(3) NOT NULL,
  `p_seni` int(3) NOT NULL,
  `k_seni` int(3) NOT NULL,
  `p_jas` int(3) NOT NULL,
  `k_jas` int(3) NOT NULL,
  `p_sunda` int(3) NOT NULL,
  `k_sunda` int(3) NOT NULL,
  `p_jumlah` int(4) NOT NULL,
  `k_jumlah` int(4) NOT NULL,
  `p_rata` int(2) NOT NULL,
  `k_rata` int(2) NOT NULL,
  `p_pre` varchar(1) NOT NULL,
  `k_pre` varchar(1) NOT NULL,
  `ket` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `uas`
--

INSERT INTO `uas` (`id_murid`, `nama_murid`, `kelas_ajaran`, `semester`, `id_guru`, `nama_guru`, `p_agama`, `k_agama`, `p_pkn`, `k_pkn`, `p_indo`, `k_indo`, `p_mtk`, `k_mtk`, `p_ipa`, `k_ipa`, `p_ips`, `k_ips`, `p_seni`, `k_seni`, `p_jas`, `k_jas`, `p_sunda`, `k_sunda`, `p_jumlah`, `k_jumlah`, `p_rata`, `k_rata`, `p_pre`, `k_pre`, `ket`) VALUES
('14.15.001', 'Anissa Putri', 'I/2014-2015', 'GENAP', 'G001', 'Siswanto, S.Pd', 80, 80, 80, 81, 82, 82, 81, 80, 80, 81, 81, 82, 82, 80, 83, 81, 80, 80, 729, 727, 81, 80, 'B', 'B', 'NAIK KELAS'),
('14.15.002', 'Amadea Fahdinda', 'I/2014-2015', 'GENAP', 'G001', 'Siswanto, S.Pd', 56, 64, 65, 63, 78, 67, 65, 61, 67, 65, 80, 68, 78, 79, 65, 67, 76, 76, 630, 610, 70, 67, 'C', 'C', 'NAIK KELAS'),
('14.15.003', 'Conita Fitriani', 'I/2014-2015', 'GENAP', 'G001', 'Siswanto, S.Pd', 23, 23, 23, 23, 23, 24, 23, 25, 24, 25, 25, 26, 26, 21, 26, 24, 24, 25, 217, 216, 24, 24, 'E', 'E', 'TINGGAL KELAS'),
('14.15.004', 'Gilang Putra', 'I/2014-2015', 'GENAP', 'G001', 'Siswanto, S.Pd', 80, 80, 80, 80, 80, 80, 81, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 721, 720, 80, 80, 'B', 'B', 'NAIK KELAS'),
('14.15.005', 'Mayanda Hilda', 'I/2014-2015', 'GENAP', 'G001', 'Siswanto, S.Pd', 80, 80, 89, 80, 89, 80, 80, 89, 89, 89, 80, 87, 89, 88, 80, 78, 89, 78, 765, 749, 85, 83, 'B', 'B', 'NAIK KELAS');

-- --------------------------------------------------------

--
-- Struktur dari tabel `uts`
--

CREATE TABLE `uts` (
  `id_murid` varchar(50) NOT NULL,
  `nama_murid` varchar(500) NOT NULL,
  `kelas_ajaran` varchar(15) NOT NULL,
  `semester` varchar(6) NOT NULL,
  `id_guru` varchar(50) NOT NULL,
  `nama_guru` varchar(500) NOT NULL,
  `p_agama` int(3) NOT NULL,
  `k_agama` int(3) NOT NULL,
  `p_pkn` int(3) NOT NULL,
  `k_pkn` int(3) NOT NULL,
  `p_indo` int(3) NOT NULL,
  `k_indo` int(3) NOT NULL,
  `p_mtk` int(3) NOT NULL,
  `k_mtk` int(3) NOT NULL,
  `p_ipa` int(3) NOT NULL,
  `k_ipa` int(3) NOT NULL,
  `p_ips` int(3) NOT NULL,
  `k_ips` int(3) NOT NULL,
  `p_seni` int(3) NOT NULL,
  `k_seni` int(3) NOT NULL,
  `p_jas` int(3) NOT NULL,
  `k_jas` int(3) NOT NULL,
  `p_sunda` int(3) NOT NULL,
  `k_sunda` int(3) NOT NULL,
  `jumlah` int(4) NOT NULL,
  `rata` int(2) NOT NULL,
  `predikat` varchar(1) NOT NULL,
  `ket` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `uts`
--

INSERT INTO `uts` (`id_murid`, `nama_murid`, `kelas_ajaran`, `semester`, `id_guru`, `nama_guru`, `p_agama`, `k_agama`, `p_pkn`, `k_pkn`, `p_indo`, `k_indo`, `p_mtk`, `k_mtk`, `p_ipa`, `k_ipa`, `p_ips`, `k_ips`, `p_seni`, `k_seni`, `p_jas`, `k_jas`, `p_sunda`, `k_sunda`, `jumlah`, `rata`, `predikat`, `ket`) VALUES
('14.15.001', 'Anissa Putri', 'I/2014-2015', 'GANJIL', 'G001', 'Siswanto, S.Pd', 82, 80, 80, 81, 81, 82, 82, 80, 81, 80, 80, 81, 81, 80, 83, 80, 81, 80, 729, 81, 'B', 'TIDAK REMEDIAL'),
('14.15.002', 'Amadea Fahdinda', 'I/2014-2015', 'GANJIL', 'G001', 'Siswanto, S.Pd', 80, 80, 81, 81, 80, 82, 82, 80, 81, 80, 80, 81, 80, 80, 80, 81, 81, 82, 725, 80, 'B', 'TIDAK REMEDIAL'),
('14.15.003', 'Conita Fitriani', 'I/2014-2015', 'GANJIL', 'G001', 'Siswanto, S.Pd', 50, 71, 81, 78, 42, 53, 80, 62, 71, 67, 70, 51, 65, 67, 71, 78, 78, 80, 608, 67, 'C', 'REMEDIAL'),
('14.15.004', 'Gilang Putra', 'I/2014-2015', 'GANJIL', 'G002', 'Novin Dinihari, S.Pd', 56, 54, 67, 67, 65, 33, 74, 64, 53, 53, 26, 63, 78, 22, 67, 67, 54, 54, 540, 60, 'C', 'REMEDIAL'),
('14.15.005', 'Mayanda Hilda', 'I/2014-2015', 'GANJIL', 'G002', 'Novin Dinihari, S.Pd', 76, 76, 78, 78, 69, 80, 80, 78, 80, 78, 81, 82, 71, 80, 86, 79, 80, 80, 701, 77, 'B', 'TIDAK REMEDIAL');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
